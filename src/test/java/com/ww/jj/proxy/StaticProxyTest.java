package com.ww.jj.proxy;

import com.ww.jj.structural.pattern.proxy.statics.Proxy;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 静态代理测试类
 * @author wangzhijun
 * @date 2021/5/11 16:58
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class StaticProxyTest {

    @Test
    public void test(){
        Proxy proxy = new Proxy();
        proxy.userRequest();
    }
}
