package com.ww.jj.factory.model.factory;

import lombok.Data;

/**
 * 具体产品A
 *
 * @author wangzhijun
 * @date 2021/4/26 14:12
 */
@Data
public class ConcreteProductA extends Product {

    private String fromFactory;

    public ConcreteProductA(String name, String fromFactory) {
        this.setName(name);
        this.fromFactory = fromFactory;
    }
}
