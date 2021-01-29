package org.mili.member.feign;

import org.mili.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("gulimall-coupon")
public interface CouponService {
    @RequestMapping("coupon/coupon/member/coupon")
    public R memberCoupons();
}
