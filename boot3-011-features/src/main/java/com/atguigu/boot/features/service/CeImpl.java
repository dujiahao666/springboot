package com.atguigu.boot.features.service;

import org.springframework.stereotype.Component;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/18 2:44
 * @description:
 */
@Component
public class CeImpl implements Ce{
    @Override
    public int sum(int a, int b) {
        return a+b;
    }
}
