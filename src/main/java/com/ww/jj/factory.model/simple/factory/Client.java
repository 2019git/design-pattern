package com.ww.jj.factory.model.simple.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author wangzhijun
 * @date 2021/4/23 16:43
 */
public class Client {

    public interface Product {

        /**
         * 生产商品统一调用接口
         *
         * @return
         * @author wangzhijun
         * @date 2021/4/23 16:37
         */
        void produce();
    }

    /**
     * 具体产品类A
     *
     * @author wangzhijun
     * @date 2021/4/23 16:32
     */
    @Slf4j
    public static class ConcreteProductA implements Product {

        @Override
        public void produce() {
            log.info("生产   A产品   成功！");
        }
    }

    /**
     * 具体产品类B
     *
     * @author wangzhijun
     * @date 2021/4/23 16:34
     */
    @Slf4j
    public static class ConcreteProductB implements Product {

        @Override
        public void produce() {
            log.info("生产   B产品    成功！");
        }
    }
}
