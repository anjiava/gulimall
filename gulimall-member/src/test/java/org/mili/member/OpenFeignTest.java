package org.mili.member;

import org.junit.jupiter.api.Test;
import org.mili.common.utils.R;
import org.mili.member.feign.CouponService;
import org.springframework.beans.factory.annotation.Autowired;

public class OpenFeignTest extends GulimallMemberApplicationTests {
    @Autowired
    private CouponService couponService;
    @Test
    void TestCoupon(){
        R result = couponService.memberCoupons();
        System.out.println(result.toString());
    }
}
