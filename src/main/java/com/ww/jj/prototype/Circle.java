package com.ww.jj.prototype;

import java.math.BigDecimal;

/**
 * 原型模式------图形--圆
 * @author wangzhijun
 * @date 2021/4/30 15:00
 */
public class Circle implements Shape{

    @Override
    public Object clone() {
        Circle circle = null;
        try {
            circle = (Circle) super.clone();
            System.out.println("克隆圆成功！");
        } catch (CloneNotSupportedException e) {
            System.out.println("克隆圆失败！");
        }
        return circle;
    }

    @Override
    public BigDecimal computeArea(Integer length) {
        BigDecimal multiply = BigDecimal.valueOf(3.14).multiply(new BigDecimal(length));
        System.out.println("圆的面积= " + multiply);
        return multiply;
    }
}
