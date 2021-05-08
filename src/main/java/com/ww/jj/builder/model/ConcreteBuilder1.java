package com.ww.jj.builder.model;

/**
 * 具体建造者1
 * @author wangzhijun
 * @date 2021/5/8 14:04
 */
public class ConcreteBuilder1 extends Builder{

    @Override
    public void builderPartA() {
        this.product.partA("ConcreteBuilder1 建造 partA");
    }

    @Override
    public void builderPartB() {
        this.product.partB("ConcreteBuilder1 建造 partB");
    }

    @Override
    public void builderPartC() {
        this.product.partC("ConcreteBuilder1 建造 partC");
    }
}
