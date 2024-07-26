package com.atguigu.web.controller;

import com.atguigu.web.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/15 18:56
 * @description:
 */

@RestController
public class FirstController {

    @Resource
    private UserService userService;


    @GetMapping("/hello")
    public void hello() {
        System.out.println("访问到了");
        userService.insert();
    }

}
