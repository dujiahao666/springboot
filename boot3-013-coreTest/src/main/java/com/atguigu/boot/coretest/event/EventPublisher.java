package com.atguigu.boot.coretest.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/18 14:35
 * @description: 用于发送事件
 */
@Service
public class EventPublisher implements ApplicationEventPublisherAware {
    //底层发事件用的组件，Spring会通过ApplicationEventPublisherAware接口自动注入给我们
    //事件是广播出去的，所有监听这个时间的监听器都可以收到
    ApplicationEventPublisher applicationEventPublisher;

    //所有事件都可以发
    public void sendEvent(ApplicationEvent event){
        //调用底层API发送事件
        applicationEventPublisher.publishEvent(event);
    }

    /**
     *会被自动调用，把真正发事件的底层组组件给我们注入进来
     * @param applicationEventPublisher
     */
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher=applicationEventPublisher;
    }
}
