package com.atguigu.boot.ssm.service;

import com.atguigu.boot.ssm.bean.TUser;
import com.atguigu.boot.ssm.mapper.UserMapper;
import jakarta.annotation.Resource;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/17 2:57
 * @description:
 */
public interface UserService {
    TUser slectOne(Long id);
}
