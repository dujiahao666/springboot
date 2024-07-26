package com.atguigu.boot;

import com.atguigu.boot.bean.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.DispatcherServlet;

@SpringBootApplication(scanBasePackages ="com.atguigu" )

public class Boot02WebApplication {

    public static void main(String[] args) {
//        ConfigurableApplicationContext run = SpringApplication.run(Boot02WebApplication.class, args);
//        User user = run.getBean("usa", User.class);
//        System.out.println(user);
//        User appconfig = run.getBean("user2", User.class);
//        System.out.println(appconfig);
//        System.out.println("=============");
//        String[] beanNamesForType = run.getBeanNamesForType(User.class);
//        for (String s : beanNamesForType) {
//            System.out.println(s);
//        }

        ConfigurableApplicationContext run = SpringApplication.run(Boot02WebApplication.class, args);
        /*User user1 = run.getBean("user2", User.class);
        User user2 = run.getBean("user2", User.class);
        System.out.println("是否是一样的:"+(user1==user2));*/

       /* User user = run.getBean("usa", User.class);
        User user2 = run.getBean("usa", User.class);
        System.out.println(user2==user);

        String[] beanNamesForType = run.getBeanNamesForType(User3.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }

        User3 bean = run.getBean("com.atguigu.ce.User3", User3.class);
        System.out.println(bean);*/

        /*String[] beanNamesForType = run.getBeanNamesForType(User3.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }
*/

      /*  String[] beanNamesForType1 = run.getBeanNamesForType(Dog.class);
        for (String s : beanNamesForType1) {
            System.out.println(s);
        }


        String[] beanNamesForType2 = run.getBeanNamesForType(Cat.class);
        for (String s : beanNamesForType2) {
            System.out.println(s);
        }*/

/*
        String[] beanNamesForType = run.getBeanNamesForType(Cat.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }*/
       /* Cat cat = run.getBean("cat", Cat.class);
        System.out.println(cat);
*/
        System.out.println("========");

      /*  String[] beanNamesForType1 = run.getBeanNamesForType(Dog.class);
        for (String s : beanNamesForType1) {
            System.out.println(s);
        }*/


        /*Dog dog = run.getBean("dog", Dog.class);
        System.out.println(dog);*/


        /*String[] beanDefinitionNames = run.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }*/
//        Pig pig = run.getBean(Pig.class);
//        System.out.println(pig);
        /*Pig pig = run.getBean("pig", Pig.class);
        System.out.println(pig);*/

/*
        Pig pig1 = run.getBean("pig2", Pig.class);
        System.out.println(pig1);*/

       /* Pig pig = run.getBean(Pig.class);
        System.out.println(pig);*/

       /* String[] beanNamesForType = run.getBeanNamesForType(Pig.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }

        Pig pig = run.getBean("pig", Pig.class);
        System.out.println(pig);

        Pig pig1 = run.getBean("pig-com.atguigu.boot.bean.Pig", Pig.class);
        System.out.println(pig1);

        Lai bean = run.getBean(Lai.class);
        System.out.println(bean);

        String[] beanNamesForType1 = run.getBeanNamesForType(Lai.class);
        for (String s : beanNamesForType1) {
            System.out.println(s)
            ;
        }*/

        /*Pig pig = run.getBean("ppp", Pig.class);
        System.out.println(pig);*/

       /* Sheep sheep = run.getBean("sheep", Sheep.class);
        System.out.println(sheep);
        Sheep sheep1 = run.getBean("sheep", Sheep.class);
        System.out.println(sheep1);
        System.out.println(sheep==sheep1);*/

       /* Sheep sheep = run.getBean(Sheep.class);
        System.out.println(sheep);

        String[] beanNamesForType = run.getBeanNamesForType(Sheep.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }*/

       /* Sheep sheep = run.getBean("sheep2", Sheep.class);
        System.out.println(sheep);

        DispatcherServlet bean = run.getBean(DispatcherServlet.class);
        System.out.println(bean);

        String[] beanNamesForType = run.getBeanNamesForType(DispatcherServlet.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }*/

        Person bean = run.getBean("person", Person.class);
        System.out.println(bean);

    }

}
