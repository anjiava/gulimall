package org.mili.product.service.impl;

import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.mili.common.utils.PageUtils;
import org.mili.common.utils.Query;

import org.mili.product.dao.CategoryDao;
import org.mili.product.entity.CategoryEntity;
import org.mili.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        List<CategoryEntity> entities = baseMapper.selectList(null);
        List<CategoryEntity> roots = entities.stream()
                .peek(entity -> {
                    if (null == entity.getSort())
                        entity.setSort(0);
                })
                .filter(entity -> entity.getParentCid() == 0)
                .sorted(Comparator.comparing(CategoryEntity::getSort))
                .collect(Collectors.toList());

        return roots.stream()
                .peek(entity -> entity.setChildren(listChildren(entity, entities)))
                .sorted(Comparator.comparing(CategoryEntity::getSort)).collect(Collectors.toList());
    }

    public List<CategoryEntity> listChildren(CategoryEntity entity, List<CategoryEntity> source) {
        return source.stream()
                .filter(entity1 -> entity1.getParentCid().equals(entity.getCatId()))
                .peek(entity1 -> entity1.setChildren(listChildren(entity1, source)))
                .sorted(Comparator.comparing(CategoryEntity::getSort))
                .collect(Collectors.toList());
    }

    @Override
    public boolean removeByIds(Collection<? extends Serializable> idList) {
        //TODO 删除菜单前需要对菜单进行检查
        baseMapper.deleteBatchIds(idList);
        return false;
    }
}