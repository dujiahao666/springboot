package com.atguigu.boot307exception.controller;

import com.atguigu.boot307exception.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/16 11:00
 * @description:
 */
@RestController
public class TwoController {
    @GetMapping("/ju")
    // DTO VO Result
    public List<Student> shuju() {
        System.out.println("业务处理...");
        List<Student> list = new ArrayList<>();
        list.add(new Student("嘉嘉", 21));
        list.add(new Student("嘉嘉2", 21));
        list.add(new Student("嘉嘉3", 21));
        list.add(new Student("嘉嘉4", 22));
        return list;
    }

    @GetMapping("ju2")
    public String ju2() {
        return "老铁，已经OK了";
    }


    @GetMapping("/end")
    public String end1() {
        int i = 10 / 0;
        return "end";
    }

}
