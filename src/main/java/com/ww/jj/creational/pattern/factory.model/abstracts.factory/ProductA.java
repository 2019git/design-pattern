package com.ww.jj.creational.pattern.factory.model.abstracts.factory;

import lombok.Data;

/**
 * 抽象产品类A
 *
 * @author wangzhijun
 * @date 2021/4/27 11:26
 */
@Data
public class ProductA {

    private String productType;

    private String productName;

    /**
     * 具体产品A1
     *
     * @author wangzhijun
     * @date 2021/4/27 11:34
     * @return
     */
    @Data
    public static class ProductA1 extends ProductA {

        private String fromFactory;

        public ProductA1(String productType, String productName, String fromFactory) {
            this.setProductType(productType);
            this.setProductName(productName);
            this.fromFactory = fromFactory;
        }
    }

    /**
     * 具体产品A2
     *
     * @author wangzhijun
     * @date 2021/4/27 11:34
     * @return
     */
    @Data
    public static class ProductA2 extends ProductA {

        private String fromFactory;

        public ProductA2(String productType, String productName, String fromFactory) {
            this.setProductType(productType);
            this.setProductName(productName);
            this.fromFactory = fromFactory;
        }
    }
}
