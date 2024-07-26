package com.atguigu.boot.features;

import com.atguigu.boot.features.bean.Cat;
import com.atguigu.boot.features.bean.Dog;
import com.atguigu.boot.features.bean.Pig;
import com.atguigu.boot.features.bean.Sheep;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 1、标识环境
 *   1)、区分出几个环境：dev(开发环境) 、 test(测试环境) 、prod(生产环境)
 *   2)、指定每个组件在那个环境下生效;  default环境：默认环境
 *          通过:@Profile("{test}")
 *          组件没有标注@Profile代表任意时候都生效
 *   3)、默认只有激活指定的环境，这些组件才会生效
 * 2、激活环境
 *    配置文件激活：spring.profiles.active=dev
 */
@Slf4j
@SpringBootApplication
public class Boot3011FeaturesApplication {

    public static void main(String[] args) {
        //SpringApplication.run(Boot3011FeaturesApplication.class, args);
        //ConfigurableApplicationContext run = new SpringApplication(Boot3011FeaturesApplication.class).run(args);


        //方式一：自定义 SpringApplication 的底层设置
        //1.自定义SpringApplication的底层设置
        SpringApplication springApplication = new SpringApplication(Boot3011FeaturesApplication.class);

        //2.程序化调整SpringApplication的参数
         //application.setDefaultProperties();如果发生冲突，以application.properties为准  【配置文件优先级高于程序化调整的优先级】
         //这个配置有用不优先
        springApplication.setBannerMode(Banner.Mode.CONSOLE);

        //3.SpringApplication 运行起来
        ConfigurableApplicationContext context = springApplication.run(args);


    /*    //方式二：Bulider方式构建 SpringApplication;     通过FlentAPI进行设置
        ConfigurableApplicationContext run = new SpringApplicationBuilder()
                .main(Boot3011FeaturesApplication.class)
                .sources(Boot3011FeaturesApplication.class)
                .bannerMode(Banner.Mode.CONSOLE)
//                .environment(null)
//                .listeners(null)
                .run(args);*/


        try {
            Cat cat = context.getBean(Cat.class);
            log.info("组件cat:{}",cat);
        }catch (Exception e){
        }

        try {
            Dog dog = context.getBean(Dog.class);
            log.info("组件dat:{}",dog);
        }catch (Exception e){
        }

        try {
            Pig pig = context.getBean(Pig.class);
            log.info("组件pig:{}",pig);
        }catch (Exception e){
        }

        try {
            Sheep sheep = context.getBean(Sheep.class);
            log.info("组件sheep:{}",sheep);
        }catch (Exception e){
        }












    }

}
