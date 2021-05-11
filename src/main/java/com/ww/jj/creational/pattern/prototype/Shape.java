package com.ww.jj.creational.pattern.prototype;

import java.math.BigDecimal;

/**
 * 原型模式------图形类
 * @author wangzhijun
 * @date 2021/4/30 14:56
 */
public interface Shape extends Cloneable{

    /**
     * copy
     * @author wangzhijun
     * @date 2021/4/30 14:59
     * @return
     */
    Object clone();

    /**
     * 计算体积
     * @author wangzhijun
     * @date 2021/4/30 14:59
     * @param length
     * @return
     */
    BigDecimal computeArea(Integer length);
}
