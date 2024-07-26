package com.atguigu.boot.coretest.robot.service;

import com.atguigu.boot.coretest.robot.properties.RobotProperties;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/18 21:00
 * @description:
 */
@Service
public class RobotService {
    @Resource
    private RobotProperties robotProperties;
    public String sayHello(){
        return "你好:"+robotProperties.getName()+"; 年龄"+robotProperties.getAge()+";  邮箱号："+robotProperties.getEmail();
    }
}
