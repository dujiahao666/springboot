package com.atguigu.web.controller;

import com.atguigu.web.pojo.Person;
import org.springframework.web.bind.annotation.*;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/14 21:58
 * @description:
 */
@RestController
public class FirstController {
    @RequestMapping("/hello")
    public String toIndex(){
        return "你好,欢迎来到springboot";
    }

    @GetMapping("/a/b/c")
    public String toStr(@RequestParam(value = "id2",required = false) String id){
        System.out.println("id的值为："+id);
        return "来了老弟";
    }


    @GetMapping("/a/b/c/{hh}/ok")      //{hh:[a-f]+}
    public String toStr2(@PathVariable("hh") String str){
        System.out.println("id的值为："+str);
        return "匹配到了";
    }

    @RequestMapping("/person")
    public Person person(){
        return new Person("归零者",159);
    }


    @GetMapping("/ok")
    public String ok(){
      int i=10;
      i=i/0;
      return "好了";
    }

 }
