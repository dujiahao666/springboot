package com.atguigu.boot.coretest.service;

import com.atguigu.boot.coretest.entity.UserEntity;
import com.atguigu.boot.coretest.event.LoginSuccessEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/18 14:21
 * @description:
 */
@Service
public class SysService {
    public void recordLog(String username){
        System.out.println(username+"登录信息已被记录");
    }

    @EventListener
    public void haha(LoginSuccessEvent loginSuccessEvent){
        System.out.println("======== SysService ========= 感知到事件"+loginSuccessEvent);
        UserEntity source = (UserEntity)loginSuccessEvent.getSource();
        recordLog(source.getUsername());
    }

}
