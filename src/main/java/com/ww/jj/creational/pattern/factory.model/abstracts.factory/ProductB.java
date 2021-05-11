package com.ww.jj.creational.pattern.factory.model.abstracts.factory;

import lombok.Data;

/**
 * 抽象产品类B
 *
 * @author wangzhijun
 * @date 2021/4/27 11:26
 */
@Data
public class ProductB {

    private String productType;

    private String productName;

    /**
     * 具体产品B1
     *
     * @author wangzhijun
     * @date 2021/4/27 11:34
     * @return
     */
    @Data
    public static class ProductB1 extends ProductB {

        private String fromFactory;

        public ProductB1(String productType, String productName, String fromFactory) {
            this.setProductType(productType);
            this.setProductName(productName);
            this.fromFactory = fromFactory;
        }
    }

    /**
     * 具体产品B2
     *
     * @author wangzhijun
     * @date 2021/4/27 11:34
     * @return
     */
    @Data
    public static class ProductB2 extends ProductB {

        private String fromFactory;

        public ProductB2(String productType, String productName, String fromFactory) {
            this.setProductType(productType);
            this.setProductName(productName);
            this.fromFactory = fromFactory;
        }
    }
}
