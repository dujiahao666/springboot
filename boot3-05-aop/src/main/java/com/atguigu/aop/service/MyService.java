package com.atguigu.aop.service;

import org.springframework.stereotype.Service;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/15 17:35
 * @description:
 */
@Service
public class MyService {
    public void doSomething() {
        System.out.println("执行方法");
    }
}
