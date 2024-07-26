package com.atguigu.boot3.starter.robot.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/18 21:03
 * @description:
 */
@Component
@ConfigurationProperties(prefix = "robot")
@Data
public class RobotProperties {
    private String name;
    private Integer age;
    private String email;
}
