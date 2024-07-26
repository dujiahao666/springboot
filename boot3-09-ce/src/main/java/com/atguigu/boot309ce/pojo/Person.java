package com.atguigu.boot309ce.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/16 23:02
 * @description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component("person1")
@ConfigurationProperties("person")
public class Person {
    @Value("培华")
    private String name;
    @Value("100")
    private Integer age;
}
