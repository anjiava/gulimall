package org.mili.product.dao;

import org.mili.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author sherlock
 * @email mamenglong076@qq.com
 * @date 2021-01-25 15:15:40
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
