package com.atguigu.boot3.fuxi.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/17 20:11
 * @description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TCar {
    private Integer id;
    private String carNum;
    private String brand;
    private Double guidePrice;
    private String produceTime;
    private String carType;
}
