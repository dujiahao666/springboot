package com.atguigu.boot.coretest.service;

import com.atguigu.boot.coretest.entity.UserEntity;
import com.atguigu.boot.coretest.event.LoginSuccessEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/18 14:20
 * @description:
 */

@Service
public class CouponService {

    public void sendCoupon(String usesrname){
        System.out.println(usesrname+"随机得到了一张优惠卷");
    }

    @Order(2)
    @EventListener
    public void onEvent(LoginSuccessEvent loginSuccessEvent){
        System.out.println("======== CouponService ========= 感知到事件"+loginSuccessEvent);
        UserEntity source = (UserEntity)loginSuccessEvent.getSource();
        sendCoupon(source.getUsername());
    }

}
