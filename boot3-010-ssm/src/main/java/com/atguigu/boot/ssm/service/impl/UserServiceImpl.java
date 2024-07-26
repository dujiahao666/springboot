package com.atguigu.boot.ssm.service.impl;

import com.atguigu.boot.ssm.bean.TUser;
import com.atguigu.boot.ssm.mapper.UserMapper;
import com.atguigu.boot.ssm.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/17 2:59
 * @description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public TUser slectOne(Long id) {
        return userMapper.getUserById(id);
    }
}
