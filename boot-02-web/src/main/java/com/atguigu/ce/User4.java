package com.atguigu.ce;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/13 0:14
 * @description:
 */
public class User4 {
    private String name;
    private String address;

    public User4() {
    }

    public User4(String name, String address) {
        this.name = name;
        this.address = address;
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

    /**
     * 获取
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "User3{name = " + name + ", address = " + address + "}";
    }
}
