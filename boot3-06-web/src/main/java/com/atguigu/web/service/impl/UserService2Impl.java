package com.atguigu.web.service.impl;

import com.atguigu.web.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;


/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/15 19:06
 * @description:
 */
@Service  //默认的bean，类名方法名首字母变小写
public class UserService2Impl implements UserService {
    public void insert() {
    }

    @Override
    public void update() {
        // 处理业务
    }
}
