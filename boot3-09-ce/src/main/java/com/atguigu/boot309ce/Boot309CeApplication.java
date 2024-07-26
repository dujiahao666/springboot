package com.atguigu.boot309ce;

import com.atguigu.boot309ce.pojo.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class Boot309CeApplication {
    public static void main(String[] args){
        ConfigurableApplicationContext run = SpringApplication.run(Boot309CeApplication.class, args);
        Person person1 = run.getBean("person1", Person.class);
        Person person2 = run.getBean("person2", Person.class);
        Person person3 = run.getBean("person3", Person.class);
        Person person4 = run.getBean("person4", Person.class);
        System.out.println(person1==person2);
        System.out.println(person2==person3);
        System.out.println(person3==person4);
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person2==person4);
    }

}











