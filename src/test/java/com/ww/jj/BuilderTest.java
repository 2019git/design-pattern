package com.ww.jj;

import com.ww.jj.builder.model.Director;
import com.ww.jj.builder.model.Product;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 建造者模式测试类
 * @author wangzhijun
 * @date 2021/5/8 14:27
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BuilderTest {

    @Test
    public void test() throws InstantiationException, IllegalAccessException {
        Director director = new Director();
        Product construct = director.construct(1);
        System.out.println("构建完成");
    }
}
