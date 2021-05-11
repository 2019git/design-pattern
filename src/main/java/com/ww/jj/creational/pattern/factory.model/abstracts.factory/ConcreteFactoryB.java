package com.ww.jj.creational.pattern.factory.model.abstracts.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体工厂B
 *
 * @author wangzhijun
 * @date 2021/4/27 11:39
 */
@Slf4j
public class ConcreteFactoryB implements AbstractFactory {

    @Override
    public ProductA createProductA() {
        log.info("具体工厂B 生产--> 具体产品A2 成功！");
        return new ProductA.ProductA2(
                "A-2", "具体产品A2", "ConcreteFactoryB"
        );
    }

    @Override
    public ProductB createProductB() {
        log.info("具体工厂B 生产--> 具体产品B2 成功！");
        return new ProductB.ProductB2(
                "B-2", "具体产品B2", "ConcreteFactoryB"
        );
    }
}
