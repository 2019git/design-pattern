package com.ww.jj.creational.pattern.builder.model;

/**
 * 具体建造者2
 * @author wangzhijun
 * @date 2021/5/8 14:04
 */
public class ConcreteBuilder2 extends Builder {

    @Override
    public void builderPartA() {
        this.product.partA("ConcreteBuilder2 建造 partA");
    }

    @Override
    public void builderPartB() {
        this.product.partB("ConcreteBuilder2 建造 partB");
    }

    @Override
    public void builderPartC() {
        this.product.partC("ConcreteBuilder2 建造 partC");
    }
}
