package com.ww.jj;

import com.ww.jj.prototype.PrototypeManager;
import com.ww.jj.prototype.Shape;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 原型模式测试类
 * @author wangzhijun
 * @date 2021/4/30 15:42
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PrototypeTest {

    @Test
    public void prototypeTest(){
        PrototypeManager manager = new PrototypeManager();
        Shape circle = manager.gainShape("circle");
        circle.computeArea(5);
        Shape square = manager.gainShape("square");
        square.computeArea(5);
    }
}
