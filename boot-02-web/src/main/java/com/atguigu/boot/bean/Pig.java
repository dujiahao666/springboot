package com.atguigu.boot.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/13 1:56
 * @description:
 */
@Component("ppp")
//@ConfigurationProperties
//@ConfigurationProperties("pig")

public class Pig {
    @Value("${pig.id}")
  private Long id;
//    @Value("${pig.name}")
    @Value("小猪宝宝")
  private String name;
//    @Value("${pig.age}")
  private Integer age;

    public Pig() {
    }

    public Pig(Long id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    public String toString() {
        return "Pig{id = " + id + ", name = " + name + ", age = " + age + "}";
    }
}
