package com.atguigu.boot3.fuxi.service;

import com.atguigu.boot3.fuxi.bean.TCar;

import java.util.List;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/17 20:27
 * @description:
 */
public interface CarService {
    List<TCar> selectAll();

    TCar selectOne(Long id);

    List<TCar> selectSome(TCar tCar);
}
