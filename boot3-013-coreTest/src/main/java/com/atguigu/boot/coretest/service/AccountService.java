package com.atguigu.boot.coretest.service;

import com.atguigu.boot.coretest.entity.UserEntity;
import com.atguigu.boot.coretest.event.LoginSuccessEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/18 14:13
 * @description:
 */
@Service
public class AccountService implements ApplicationListener<LoginSuccessEvent> {
    public void addAccountScore(String username) {
        System.out.println(username + "加了一积分");
    }

    @Order(3)
    @Override
    public void onApplicationEvent(LoginSuccessEvent event) {
        System.out.println("========= AccountService" + "收到事件 ==========");
        UserEntity source = (UserEntity) event.getSource();
        addAccountScore(source.getUsername());
    }
}
