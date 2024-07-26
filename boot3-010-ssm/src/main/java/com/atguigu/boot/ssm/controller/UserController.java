package com.atguigu.boot.ssm.controller;

import com.atguigu.boot.ssm.bean.TUser;
import com.atguigu.boot.ssm.mapper.UserMapper;
import com.atguigu.boot.ssm.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/17 2:35
 * @description:
 */
@RestController
public class UserController {
    @Resource
    private UserService userService;

    /**
     * 返回user的json数据
     * @param id
     * @return
     */
    @GetMapping("/user/{id}")
    public TUser getUser(@PathVariable("id") Long id){
        TUser tUser = userService.slectOne(id);
        return tUser;
    }

}
