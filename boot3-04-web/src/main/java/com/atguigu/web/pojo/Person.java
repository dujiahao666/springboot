package com.atguigu.web.pojo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/14 2:23
 * @description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ConfigurationProperties("person")
@JacksonXmlRootElement
public class Person {
    private String name;
    private Integer age;
}
