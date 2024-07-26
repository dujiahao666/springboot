package com.atguigu.boot.ssm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



/**
 * 1. @MapperScan告诉Mybatis，扫描哪个包下面的所有接口
 * 2.告诉MyBatis,每个接口的xml文件都在那里
 * 3.Mybatis自动关联绑定
 */
//@MapperScan("com.atguigu.boot.ssm.mapper")
 @MapperScan(basePackages ="com.atguigu.boot.ssm.mapper" )
@SpringBootApplication
public class Boot3010SsmApplication {

    public static void main(String[] args) {
        SpringApplication.run(Boot3010SsmApplication.class, args);
    }

}
