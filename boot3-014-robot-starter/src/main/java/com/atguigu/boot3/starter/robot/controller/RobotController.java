package com.atguigu.boot3.starter.robot.controller;


import com.atguigu.boot3.starter.robot.service.RobotService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/18 21:12
 * @description:
 */
@RestController

public class RobotController {
    @Resource
    private RobotService robotService;


    @GetMapping("/robot/hello")
    public String sayHello(){
        return robotService.sayHello();
    }
}
