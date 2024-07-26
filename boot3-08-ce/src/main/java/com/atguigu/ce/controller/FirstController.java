package com.atguigu.ce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/16 14:34
 * @description:
 */
@RestController
public class FirstController {
    @GetMapping("/hello")
    public String to(){
        int i=10/0;
        return "你好";
    }

    @GetMapping("/aa")
    public String aa(){
        return "没有问题";
    }
}
