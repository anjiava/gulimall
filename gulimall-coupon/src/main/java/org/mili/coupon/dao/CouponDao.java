package org.mili.coupon.dao;

import org.mili.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author sherlock
 * @email mamenglong076@qq.com
 * @date 2021-01-25 16:17:03
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
