package com.atguigu.boot3.starter.robot;

import com.atguigu.boot3.starter.robot.controller.RobotController;
import com.atguigu.boot3.starter.robot.properties.RobotProperties;
import com.atguigu.boot3.starter.robot.service.RobotService;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/18 21:50
 * @description:
 */
@Configuration
//给容器中导入Robot功能要用的所有组件
@Import({RobotController.class, RobotProperties.class, RobotService.class})
public class RobotAutoConfiguration {
}
