package com.atguigu.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class Boot304WebApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Boot304WebApplication.class, args);
//        All all = run.getBean("all", All.class);
//        System.out.println(all);

       /* Stu bean = run.getBean(Stu.class);
        System.out.println(bean);*/

    }

}
