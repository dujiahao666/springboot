package com.atguigu.boot.features.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/18 2:37
 * @description:
 */
@RestController
public class FirstCon {
    @Value("${aaa:默认值}")
    private String str;

    @GetMapping("/aa")
    public String toOne() {
        return str;
    }
}
