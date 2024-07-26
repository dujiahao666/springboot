package com.atguigu.boot3.starter.annotation;

import com.atguigu.boot3.starter.robot.RobotAutoConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.DelegatingWebMvcConfiguration;

import java.lang.annotation.*;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/18 22:10
 * @description:
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import({RobotAutoConfiguration.class})
public @interface EnableRobot {
}
