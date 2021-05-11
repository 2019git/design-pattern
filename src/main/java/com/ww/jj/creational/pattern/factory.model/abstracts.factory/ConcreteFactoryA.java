package com.ww.jj.creational.pattern.factory.model.abstracts.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体工厂A
 *
 * @author wangzhijun
 * @date 2021/4/27 11:39
 */
@Slf4j
public class ConcreteFactoryA implements AbstractFactory {

    @Override
    public ProductA createProductA() {
        log.info("具体工厂A 生产--> 具体产品A1 成功！");
        return new ProductA.ProductA1(
                "A-1", "具体产品A1", "ConcreteFactoryA"
        );
    }

    @Override
    public ProductB createProductB() {
        log.info("具体工厂A 生产--> 具体产品B1 成功！");
        return new ProductB.ProductB1(
                "B-1", "具体产品B1", "ConcreteFactoryA"
        );
    }
}
