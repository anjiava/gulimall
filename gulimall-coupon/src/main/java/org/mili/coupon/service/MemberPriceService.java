package org.mili.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.mili.common.utils.PageUtils;
import org.mili.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author sherlock
 * @email mamenglong076@qq.com
 * @date 2021-01-25 16:17:03
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

