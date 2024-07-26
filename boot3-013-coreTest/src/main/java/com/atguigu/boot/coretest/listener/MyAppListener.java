package com.atguigu.boot.coretest.listener;

import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.time.Duration;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/18 3:12
 * @description: SpringBoot听应用生命周期监
 */
public class MyAppListener implements SpringApplicationRunListener {
    @Override
    public void starting(ConfigurableBootstrapContext bootstrapContext) {
        System.out.println("========startring======正在启动=========");
    }

    @Override
    public void environmentPrepared(ConfigurableBootstrapContext bootstrapContext, ConfigurableEnvironment environment) {
        System.out.println("========environmentPrepared======环境准备完成=========");
    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
        System.out.println("========contextPrepared======ioc容器准备完成=========");
    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        System.out.println("========contextLoaded======ioc容器加载完成=========");
    }

    @Override
    public void started(ConfigurableApplicationContext context, Duration timeTaken) {
        System.out.println("========started======启动完成=========");
    }

    @Override
    public void ready(ConfigurableApplicationContext context, Duration timeTaken) {
        System.out.println("========ready======准备就绪=========");
    }

    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {
        System.out.println("========failed======应用启动失败=========");
    }
}
