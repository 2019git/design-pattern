package com.ww.jj.creational.pattern.prototype;

import java.math.BigDecimal;

/**
 * 原型模式------图形--正方形
 * @author wangzhijun
 * @date 2021/4/30 15:08
 */
public class Square implements Shape{

    @Override
    public Object clone() {
        Square square = null;
        try {
            square = (Square) super.clone();
            System.out.println("克隆正方形成功！");
        } catch (CloneNotSupportedException e) {
            System.out.println("克隆正方形失败！");
        }
        return square;
    }

    @Override
    public BigDecimal computeArea(Integer length) {
        BigDecimal decimal = new BigDecimal(length * length);
        System.out.println("正方形的面积= " + decimal);
        return decimal;
    }
}
