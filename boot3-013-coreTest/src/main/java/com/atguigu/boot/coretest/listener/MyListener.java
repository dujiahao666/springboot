package com.atguigu.boot.coretest.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/18 14:41
 * @description: 作用：用于感知事件的
 */
public class MyListener implements ApplicationListener<ApplicationEvent> {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("=========事件==========到达=========="+event);
    }

}
