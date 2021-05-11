package com.ww.jj.creational.pattern.factory.model.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体工厂A
 *
 * @author wangzhijun
 * @date 2021/4/26 14:14
 */
@Slf4j
public class ConcreteFactoryA implements AbstractFactory {

    @Override
    public Product createProduct() {
        log.info("生产   产品A   成功！");
        return new ConcreteProductA("产品A", "生产工厂A");
    }
}
