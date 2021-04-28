package com.ww.jj;

import com.ww.jj.factory.model.abstracts.factory.AbstractFactory;
import com.ww.jj.factory.model.abstracts.factory.ProductA;
import com.ww.jj.factory.model.abstracts.factory.ProductB;
import lombok.Getter;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 抽象工厂模式测试类
 *
 * @author wangzhijun
 * @date 2021/4/27 13:43
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AbstractFactoryTest {

    @Getter
    public enum ChooseFactoryEnum {
        FACTORY_A(0, com.ww.jj.factory.model.abstracts.factory.ConcreteFactoryA.class),
        FACTORY_B(1, com.ww.jj.factory.model.abstracts.factory.ConcreteFactoryB.class);

        private Integer type;

        private Class<?> aClass;

        ChooseFactoryEnum(Integer type, Class<?> aClass) {
            this.type = type;
            this.aClass = aClass;
        }

        public static Class<?> getFactory(Integer type) {
            for (ChooseFactoryEnum value : values()) {
                if (value.getType().equals(type)) {
                    return value.getAClass();
                }
            }
            return null;
        }
    }

    @Test
    public void testAbstractFactory() throws IllegalAccessException, InstantiationException {
        Class<?> aClass = ChooseFactoryEnum.getFactory(ChooseFactoryEnum.FACTORY_A.getType());
        AbstractFactory factory = (AbstractFactory) aClass.newInstance();
        ProductA productA = factory.createProductA();
        System.out.println("商品类型----->" + productA.getProductType() + ",  商品名称----->" + productA.getProductName());
        ProductB productB = factory.createProductB();
        System.out.println("商品类型----->" + productB.getProductType() + ",  商品名称----->" + productB.getProductName());
    }
}
