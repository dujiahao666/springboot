package com.atguigu.aop.controller;

import com.atguigu.aop.service.MyService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/15 17:54
 * @description:
 */
@RestController
public class AOPController {
    @Resource
    private MyService myService;

    @GetMapping("/test")
    public void AOPTest(){
        myService.doSomething();
    }

}
