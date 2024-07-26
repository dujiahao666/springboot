package com.atguigu.boot.coretest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/18 14:46
 * @description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
    private String username;
    private String passwd;
}
