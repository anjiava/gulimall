package org.mili.product;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mili.product.entity.BrandEntity;
import org.mili.product.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class GulimallProductApplicationTests {
    @Autowired
    private BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity entity = new BrandEntity();
        entity.setName("apple");
        entity.setDescript("美国最强手机企业");
        brandService.save(entity);
        System.out.println("save success");
    }

}
