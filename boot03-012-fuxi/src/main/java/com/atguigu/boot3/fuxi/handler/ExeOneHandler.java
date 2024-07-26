package com.atguigu.boot3.fuxi.handler;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/17 20:30
 * @description:
 */
@ControllerAdvice
public class ExeOneHandler {

    @ExceptionHandler
    public String tip(Exception e, Model model){
        model.addAttribute("yichang",e);
        return "tip";
    }
}
