package org.mili.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.mili.common.utils.PageUtils;
import org.mili.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author sherlock
 * @email mamenglong076@qq.com
 * @date 2021-01-25 15:13:45
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

