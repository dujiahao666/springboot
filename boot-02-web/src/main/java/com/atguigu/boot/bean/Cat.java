package com.atguigu.boot.bean;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/13 0:50
 * @description:
 */
public class Cat {
    private String name;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Cat{name = " + name + "}";
    }
}
