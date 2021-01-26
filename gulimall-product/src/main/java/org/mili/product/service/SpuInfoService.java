package org.mili.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.mili.common.utils.PageUtils;
import org.mili.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author sherlock
 * @email mamenglong076@qq.com
 * @date 2021-01-25 15:15:40
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

