package org.mili.product;

import org.junit.jupiter.api.Test;
import org.mili.product.entity.BrandEntity;
import org.mili.product.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallProductApplicationTests {
    @Autowired
    private BrandService brandService;
    @Test
    void contextLoads() {
        BrandEntity entity = new BrandEntity();
        entity.setName("Huawei");
        entity.setDescript("国内最强手机企业");
        brandService.save(entity);
        System.out.println("save success");
    }

}
