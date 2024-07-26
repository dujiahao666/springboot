package com.atguigu.boot3.fuxi.mapper;

import com.atguigu.boot3.fuxi.bean.TCar;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/17 20:13
 * @description:
 */
public interface CarMapper {
    List<TCar> selectAll();

    TCar selectOne(@Param("id") Long id);

    List<TCar> selectSome(TCar tCar);
}
