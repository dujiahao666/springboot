package com.atguigu.boot307exception.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/16 11:00
 * @description:
 */
@Controller
public class FirstController {

    @GetMapping( "/index")
    public String index(){
//        int i=10/0;
        return "index";
    }

    @GetMapping( "/index2")
    public String index2(){
//        int i=10/0;
        return "index2";
    }



//    @ExceptionHandler
//    public String tip(Exception e, Model model){
//        model.addAttribute("yichang",e);
//        return "tip";
//    }

}
