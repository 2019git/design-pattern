package com.ww.jj.factory.model.factory;

/**
 * 抽象工厂
 *
 * @author wangzhijun
 * @date 2021/4/26 14:08
 */
public interface AbstractFactory {

    /**
     * 创建商品
     *
     * @return
     * @author wangzhijun
     * @date 2021/4/26 14:11
     */
    Product createProduct();
}
