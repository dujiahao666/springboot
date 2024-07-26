package com.atguigu.boot.features;

import com.atguigu.boot.features.service.Ce;
import com.atguigu.boot.features.service.Ce2;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Boot3011FeaturesApplicationTests {
    @Resource
    Ce ce;
    @Resource
    Ce2 ce2;

    @DisplayName("测试一")
    @Test
    void contextLoads() {
        int sum = ce.sum(1, 3);
        Assertions.assertEquals(4,sum,"数据不对应");
        System.out.println("总合是："+sum);
    }

    @BeforeEach
    public void ce(){
        System.out.println("=============zhixing----------------");
    }


    @DisplayName("测试2")
    @Test
    public void ce3(){
        ce2.show();
    }


}
