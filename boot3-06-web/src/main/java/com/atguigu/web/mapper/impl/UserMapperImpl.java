package com.atguigu.web.mapper.impl;

import com.atguigu.web.mapper.UserMapper;
import org.springframework.stereotype.Component;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/15 19:11
 * @description:
 */
@Component
public class UserMapperImpl implements UserMapper {
    @Override
    public void insert() {
        System.out.println("调用数据库新增数据！");
    }
}
