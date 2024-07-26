package com.atguigu.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/13 22:14
 * @description:
 */
@Component
@ConfigurationProperties("person")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String name;
   private Integer age;
   private Date birthDay;
   private Boolean like;
   private Child child;
   private List<Dog> dogs;
   private Map<String,Cat> cats;

   private Set<String> sets;
}
