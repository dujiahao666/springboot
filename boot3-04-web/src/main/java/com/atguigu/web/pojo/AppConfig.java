package com.atguigu.web.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/14 2:23
 * @description:
 */
@Configuration
@EnableConfigurationProperties(Person.class)
public class AppConfig {
    /*@Autowired
    Person person;*/
    @Bean
    public All all(Person person){
        return new All(1,person);
    }
}
