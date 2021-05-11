package com.ww.jj.factory;

import com.ww.jj.creational.pattern.factory.model.factory.AbstractFactory;
import com.ww.jj.creational.pattern.factory.model.factory.Product;
import lombok.Getter;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 工厂模式测试类
 *
 * @author wangzhijun
 * @date 2021/4/26 14:31
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class FactoryTest {

    @Getter
    public enum ChooseProductEnum {
        PRODUCT_A(0, com.ww.jj.creational.pattern.factory.model.factory.ConcreteFactoryA.class),
        PRODUCT_B(1, com.ww.jj.creational.pattern.factory.model.factory.ConcreteFactoryB.class);

        private Integer type;

        private Class<?> aClass;

        ChooseProductEnum(Integer type, Class<?> aClass) {
            this.type = type;
            this.aClass = aClass;
        }

        public static Class<?> getFactory(Integer type) {
            for (ChooseProductEnum value : values()) {
                if (value.type.equals(type)) {
                    return value.aClass;
                }
            }
            return null;
        }
    }

    /**
     * 工厂模式测试
     *
     * @return
     * @author wangzhijun
     * @date 2021/4/26 15:51
     */
    @Test
    public void createProduct() throws IllegalAccessException, InstantiationException {
        Class<?> aClass = ChooseProductEnum.getFactory(ChooseProductEnum.PRODUCT_B.getType());
        AbstractFactory factory = (AbstractFactory) aClass.newInstance();
        Product product = factory.createProduct();
        System.out.println(product.getName());
    }
}
