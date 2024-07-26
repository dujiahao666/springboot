package com.atguigu.boot.ssm.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/17 1:58
 * @description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TUser {
  private Long id;
  private String loginName;
  private String nikeName;
  private String passwd;
}
