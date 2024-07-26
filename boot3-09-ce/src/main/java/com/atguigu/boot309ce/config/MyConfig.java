package com.atguigu.boot309ce.config;

import com.atguigu.boot309ce.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/16 23:04
 * @description:
 */
@Configuration
@ComponentScan("com.atguigu")

//@Import(Person.class)
public class MyConfig {


    @Bean
    public Person person2() {
        return new Person("君君",29);
    }

    @Bean
    public Person person3() {
        return new Person("嘉嘉",21);
    }



    @Bean
    public Person person4(@Qualifier("person1") Person person) {
        person.setName("小哥");
        person.setAge(22);
        return person;
    }

   /* @Bean
    public Person person4(@Qualifier("person2") Person person) {
        person.setName("小哥");
        return person;
    }*/




}
