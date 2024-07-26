package com.atguigu.boot307exception.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/16 11:09
 * @description:统一处理异常
 */

@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler
    //@ResponseBody
    public String to(Exception e, Model model) {
        model.addAttribute("yichang", e);
        return "tip";
    }

}
