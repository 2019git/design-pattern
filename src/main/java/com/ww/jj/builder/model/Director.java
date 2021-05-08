package com.ww.jj.builder.model;

import lombok.Getter;

/**
 * 指挥者
 * @author wangzhijun
 * @date 2021/5/8 14:10
 */
public class Director {

    @Getter
    public enum BuilderType{
        BUILDER1(1, com.ww.jj.builder.model.ConcreteBuilder1.class),
        BUILDER2(2, com.ww.jj.builder.model.ConcreteBuilder2.class);

        private Integer type;

        private Class<?> aClass;

        BuilderType(Integer type, Class<?> aClass) {
            this.type = type;
            this.aClass = aClass;
        }

        public static Class<?> gainBuilderClass(Integer type){
            for (BuilderType value : values()) {
                if (value.getType().intValue() == type.intValue()){
                    return value.getAClass();
                }
            }
            return null;
        }
    }

    /**
     * 产品构建方法
     * @author wangzhijun
     * @date 2021/5/8 14:12
     * @return
     */
    public Product construct(Integer type) throws IllegalAccessException, InstantiationException {
        Class<?> aClass = BuilderType.gainBuilderClass(type);
        Builder builder = (Builder) aClass.newInstance();
        builder.builderPartA();
        builder.builderPartB();
        builder.builderPartC();
        Product product = builder.gainProduct();
        return product;
    }
}
