package com.ww.jj.factory;

import com.ww.jj.creational.pattern.factory.model.simple.factory.Client;

/**
 * 简单工厂类
 *
 * @author wangzhijun
 * @date 2021/4/23 16:30
 */
public class SimpleFactoryTest {

    static final int PRODUCT_A = 0;

    static final int PRODUCT_B = 1;

    static final int PRODUCT_C = 2;

    /**
     * 生产商品
     *
     * @param type
     * @return
     * @author wangzhijun
     * @date 2021/4/23 16:50
     */
    public static Client.Product makeProduct(Integer type) {
        switch (type) {
            case PRODUCT_A:
                return new Client.ConcreteProductA();
            case PRODUCT_B:
                return new Client.ConcreteProductB();
        }
        return null;
    }

    public static void main(String[] args) {
        Client.Product product = makeProduct(PRODUCT_A);
        product.produce();
    }
}
