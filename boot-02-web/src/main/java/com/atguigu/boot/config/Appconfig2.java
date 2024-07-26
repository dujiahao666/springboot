package com.atguigu.boot.config;

//import com.alibaba.druid.FastsqlException;
import com.atguigu.boot.bean.*;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/13 0:50
 * @description:
 */
@SpringBootConfiguration
@EnableConfigurationProperties(value = {Sheep.class})
//@EnableConfigurationProperties(Pig.class)
@Import(Lai.class)
public class Appconfig2 {
    @Bean
    @ConditionalOnClass(name = "com.alibaba.druid.FastsqlException")
    public Cat cat(){
     return new Cat("小猫咪");
    }

    @Bean
    @ConditionalOnMissingClass(value = "com.alibaba.druid.FastsqlException")
    public Dog dog(){
        return new Dog("小狗狗");
    }

    @Bean
    @ConditionalOnBean(name = "dog",value = Dog.class)
    public User3 zhangsan(){
        return new User3(66,"张三");
    }

    /*@Bean
    @ConditionalOnBean(name = "cat",value = Cat.class)
    public User3 lisi(){
        return new User3(66,"李四");
    }*/

    @Bean
    @ConditionalOnMissingBean(value = Dog.class)
    public User3 lisi(){
        return new User3(66,"李四");
    }


    /*@Bean
    @ConfigurationProperties("pig")
    public Pig pig2(){
//        return new Pig(6l,"小哥哥",3);
        return new Pig();
    }*/

   /* @Bean
//    @ConfigurationProperties()
    public Pig pig2(){
        return new Pig(6l,"小哥哥",3);
//        return new Pig();
    }*/

   /* @Bean
    public Sheep sheep(){
        return new Sheep(3l,"真的",21);
    }*/

    @Bean
    public Sheep sheep2(){
        return new Sheep(3l,"真的假的",2);
    }

}
