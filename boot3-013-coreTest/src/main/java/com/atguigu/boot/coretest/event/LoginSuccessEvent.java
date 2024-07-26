package com.atguigu.boot.coretest.event;

import com.atguigu.boot.coretest.entity.UserEntity;
import org.springframework.context.ApplicationEvent;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/18 14:39
 * @description:
 */
public class LoginSuccessEvent extends ApplicationEvent {
    /**
     *
     * @param source 代表是谁登录成功了
     */
    public LoginSuccessEvent(UserEntity source) {
        super(source);
    }
}
