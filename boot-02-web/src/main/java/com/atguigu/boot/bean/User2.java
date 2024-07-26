package com.atguigu.boot.bean;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/12 23:00
 * @description:
 */
public class User2 {
 private Integer id;
 private String name;

 public User2() {
 }

 public User2(Integer id, String name) {
  this.id = id;
  this.name = name;
 }

 /**
  * 获取
  * @return id
  */
 public Integer getId() {
  return id;
 }

 /**
  * 设置
  * @param id
  */
 public void setId(Integer id) {
  this.id = id;
 }

 /**
  * 获取
  * @return name
  */
 public String getName() {
  return name;
 }

 /**
  * 设置
  * @param name
  */
 public void setName(String name) {
  this.name = name;
 }

 public String toString() {
  return "User2{id = " + id + ", name = " + name + "}";
 }
}
