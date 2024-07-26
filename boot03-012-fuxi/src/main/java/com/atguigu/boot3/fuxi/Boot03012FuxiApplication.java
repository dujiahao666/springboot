package com.atguigu.boot3.fuxi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.atguigu.boot3.fuxi.mapper")
@SpringBootApplication
public class Boot03012FuxiApplication {

    public static void main(String[] args) {
        SpringApplication.run(Boot03012FuxiApplication.class, args);
    }

}
