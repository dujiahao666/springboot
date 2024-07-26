package com.atguigu.web.service.impl;

import com.atguigu.web.mapper.UserMapper;
import com.atguigu.web.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/15 19:01
 * @description:
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    public void insert() {
        userMapper.insert();
    }

    @Override
    public void update() {
        // 处理业务
        userMapper.insert();
    }
}
