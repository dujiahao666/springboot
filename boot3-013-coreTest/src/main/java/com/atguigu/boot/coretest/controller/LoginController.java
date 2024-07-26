package com.atguigu.boot.coretest.controller;

import com.atguigu.boot.coretest.entity.UserEntity;
import com.atguigu.boot.coretest.event.EventPublisher;
import com.atguigu.boot.coretest.event.LoginSuccessEvent;
import com.atguigu.boot.coretest.service.AccountService;
import com.atguigu.boot.coretest.service.CouponService;
import com.atguigu.boot.coretest.service.SysService;
import jakarta.annotation.Resource;
import org.apache.coyote.Request;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/18 14:07
 * @description:
 */
@RestController
public class LoginController {
    @Resource
    AccountService accountService;
    @Resource
    CouponService couponService;
    @Resource
    SysService sysService;

    @Resource
    EventPublisher eventPublisher;


    @GetMapping("/login")
    public String login(@RequestParam(value = "username",required = false)String username,
                        @RequestParam(value = "passwd",required = false) String passwd){
        //业务处理登录
        System.out.println("业务处理登录完成");


        //1、账户服务自动签到加积分
        //2、优惠服务随机发送优惠卷
        //3、系统服务等级用户的登录信息

        //TODO 发送事件
        //1.创建事件信息
        LoginSuccessEvent event = new LoginSuccessEvent(new UserEntity(username, passwd));
        //2、发送事件
        eventPublisher.sendEvent(event);

       /* accountService.addAccountScore(username);
        couponService.sendCoupon(username);
        sysService.recordLog(username);*/

        //设计模式：对新增开放，对修改关闭
        //xxx
        //xxx
        //xxx

        return username+"登录成功";
    }
}
