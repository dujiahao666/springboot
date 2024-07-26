package com.atguigu.boot3.fuxi.controller;

import com.atguigu.boot3.fuxi.bean.TCar;
import com.atguigu.boot3.fuxi.service.CarService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/17 20:29
 * @description:
 */
@RestController
public class FirstController {
    @Resource
    private CarService carService;

    @GetMapping("/haha")
    public List<TCar> all(){
        List<TCar> tCars = carService.selectAll();
        return tCars;
    }

    @GetMapping("/one/{id}")
    public TCar one(@PathVariable(value = "id",required = false) Long id){
        return carService.selectOne(id);
    }


    @GetMapping("/some")
    public List<TCar> some(TCar tCar){
        List<TCar> tCars = carService.selectSome(tCar);
        System.out.println(tCar);
        return tCars;
    }

}
