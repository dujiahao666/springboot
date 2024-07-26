package com.atguigu.web.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/15 13:13
 * @description:
 */
@Controller    //适配 服务端渲染 【只能用@controller  或者 @RestController 】
//@Component  这个注解，以及其他注解不可以，要要跟前端交互
/*
 如果你使用 @Component 注解而不是 @Controller 注解来标记控制器类，Spring Boot 将不会自动将其识别为一个控制器，
 并且不会为其配置默认的视图解析器。这意味着你需要手动配置视图解析器和其他相关配置，以确保控制器能够正确处理视图渲染。
 具体来说，使用 @Component 注解标记的类是一个通用的 Spring 组件，它不会自动关联到 Spring MVC 的视图解析流程中
 */
public class WelcomeController {
    @GetMapping("/well")
    public String hello(@RequestParam(value = "name",required = false) String name, ModelMap modelMap) {
        //@RequestParam(value = "name")注意这个注解 ,required默认为true可能会导致我们匹配不到
        modelMap.addAttribute("msg",name);
        return "wellcome";
    }

    @RequestMapping(value = {"/two","two2"})
    public String two(){
        return "two";
    }

}
