package com.ww.jj.creational.pattern.factory.model.abstracts.factory;

/**
 * 抽象工厂类
 *
 * @author wangzhijun
 * @date 2021/4/27 11:26
 * @return
 */
public interface AbstractFactory {

    /**
     * 创建商品A
     *
     * @param
     * @return
     * @author wangzhijun
     * @date 2021/4/27 11:38
     */
    ProductA createProductA();

    /**
     * 创建商品B
     *
     * @param
     * @return
     * @author wangzhijun
     * @date 2021/4/27 11:38
     */
    ProductB createProductB();
}