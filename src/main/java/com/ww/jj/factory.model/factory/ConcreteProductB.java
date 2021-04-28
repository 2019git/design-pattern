package com.ww.jj.factory.model.factory;

import lombok.Data;

/**
 * 具体产品B
 *
 * @author wangzhijun
 * @date 2021/4/26 14:13
 */
@Data
public class ConcreteProductB extends Product {

    private String fromFactory;

    public ConcreteProductB(String name, String fromFactory) {
        this.setName(name);
        this.fromFactory = fromFactory;
    }
}
