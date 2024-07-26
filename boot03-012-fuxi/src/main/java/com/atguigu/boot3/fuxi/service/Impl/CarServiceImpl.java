package com.atguigu.boot3.fuxi.service.Impl;

import com.atguigu.boot3.fuxi.bean.TCar;
import com.atguigu.boot3.fuxi.mapper.CarMapper;
import com.atguigu.boot3.fuxi.service.CarService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/17 20:28
 * @description:
 */
@Service
public class CarServiceImpl implements CarService {
    @Resource
    private CarMapper carMapper;
    @Override
    public List<TCar> selectAll() {
        return carMapper.selectAll();
    }

    @Override
    public TCar selectOne(Long id) {
        return carMapper.selectOne(id);
    }

    @Override
    public List<TCar> selectSome(TCar tCar) {
        return carMapper.selectSome(tCar);
    }
}
