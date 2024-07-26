package com.atguigu.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/13 22:32
 * @description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Child {
    private String name;
    private Integer age;
    private List<String> text;
}
