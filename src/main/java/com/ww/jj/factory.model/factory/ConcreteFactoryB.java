package com.ww.jj.factory.model.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体工厂B
 *
 * @author wangzhijun
 * @date 2021/4/26 14:16
 */
@Slf4j
public class ConcreteFactoryB implements AbstractFactory {

    @Override
    public Product createProduct() {
        log.info("生产   产品B   成功！");
        return new ConcreteProductB("产品B", "生产工厂B");
    }
}
