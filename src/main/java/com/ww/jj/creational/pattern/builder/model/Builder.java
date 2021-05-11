package com.ww.jj.creational.pattern.builder.model;

/**
 * 抽象建造者
 * @author wangzhijun
 * @date 2021/5/8 14:00
 */
public abstract class Builder {

    protected Product.ProductBuilder product = Product.builder();

    public abstract void builderPartA();

    public abstract void builderPartB();

    public abstract void builderPartC();

    public Product gainProduct(){
        return product.build();
    }
}
