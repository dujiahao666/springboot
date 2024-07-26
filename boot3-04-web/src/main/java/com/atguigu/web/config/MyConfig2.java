package com.atguigu.web.config;

import com.atguigu.web.component.MyYamlHttpMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/15 0:01
 * @description: 写配置类的方式2【代码式】
 */

//@Configuration   //这是一个配置类，给容器中方一个WebMvcConfigurer 组价，就能自定义底层
//public class MyConfig2 {
//    @Bean
//    public WebMvcConfigurer webMvcConfigurer(){
//            return new WebMvcConfigurer() {
//                @Override
//                public void addResourceHandlers(ResourceHandlerRegistry registry) {
//                    registry.addResourceHandler("/static/**")                             //访问资源的前缀
//                            .addResourceLocations("classpath:/a/","classpath:/b/")            //匹配的资源路径
//                            .setCacheControl(CacheControl.maxAge(7200, TimeUnit.SECONDS));     //设置缓存
//                }
//
//
//                @Override     //  配置拦截器
//                public void addInterceptors(InterceptorRegistry registry) {
//                    WebMvcConfigurer.super.addInterceptors(registry);
//                }
//
//
//                @Override    //  配置一个能把对象转成yaml的messageConverter
//                public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//                    converters.add(new MyYamlHttpMessageConverter());
//                }
//            };
//    }
//}
