package com.atguigu.boot.ssm.mapper;

import com.atguigu.boot.ssm.bean.TUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/17 2:01
 * @description:
 */

@Mapper
public interface UserMapper {
    /**
     * 每个方法都在Mapper文件中有一个sql标签对应
     * 所有参数都应该用@Param进行签名，以后使用指定的名字在SQL中取值
     * @param id
     * @return
     */
    TUser getUserById(@Param("id") Long id);
}
