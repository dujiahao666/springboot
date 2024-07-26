package com.atguigu.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/12 21:10
 * @description:
 */
@RestController
public class FirstController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello Springboot 3!";
    }
}
