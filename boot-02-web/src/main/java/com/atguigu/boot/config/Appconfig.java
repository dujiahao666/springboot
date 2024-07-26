package com.atguigu.boot.config;

import com.atguigu.boot.bean.User;
import com.atguigu.boot.bean.User2;
import com.atguigu.ce.User4;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.*;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/12 22:59
 * @description:
 */
//@Configuration  //这是一个配置类，代替以前的配置文件、配置类本身也是容器中的组件
@SpringBootConfiguration //代表这是一个spirngboot配置类
//@ComponentScan("com.atguigu")

@Import(User4.class)
public class Appconfig {

    @Bean("user2")
    @Scope("singleton")
    //代替以前的Bean标签。组件在容器中的名字是方法名，可以直接修改注解的值
    public User toIoc(){
        return new User(2,"君君");
    }

    @Bean("user3")  //代替以前的Bean标签。组件在容器中的名字是方法名，可以直接修改注解的值
    public User toIoc2(){
        return new User(3,"君君2");
    }

    @Bean("user4")  //代替以前的Bean标签。组件在容器中的名字是方法名，可以直接修改注解的值
    public User2 toIoc43(){
        return new User2(1,"这是user2的类型");
    }
}
