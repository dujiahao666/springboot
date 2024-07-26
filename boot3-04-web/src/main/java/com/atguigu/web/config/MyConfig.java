package com.atguigu.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.concurrent.TimeUnit;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/14 23:08
 * @description: 使用代码的方式来自动以静态资源规则
 */

//@Configuration
//将WebMvcConfigurer纳入ioc
//public class MyConfig implements WebMvcConfigurer {
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        //保留以前的配置（这个不写也是存在的，可以不写）
//        WebMvcConfigurer.super.addResourceHandlers(registry);
//        //自己写
//        registry.addResourceHandler("/static/**")                             //访问资源的前缀
//                        .addResourceLocations("classpath:/a/","classpath:/b/")            //匹配的资源路径
//                        .setCacheControl(CacheControl.maxAge(7200, TimeUnit.SECONDS));     //设置缓存
//    }
//
//
//}
