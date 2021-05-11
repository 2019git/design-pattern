package com.ww.jj.proxy;

import com.ww.jj.structural.pattern.proxy.dynamic.DynamicProxy;
import com.ww.jj.structural.pattern.proxy.dynamic.RealTarget;
import com.ww.jj.structural.pattern.proxy.dynamic.Target;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 动态代理测试类
 *
 * @author wangzhijun
 * @date 2021/5/11 17:53
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DynamicProxyTest {

    @Test
    public void test() {
        DynamicProxy dynamicProxy = new DynamicProxy();
        Target instance = dynamicProxy.getInstance(new RealTarget());
        instance.requestTargetInfo();
        instance.requestTargetInfoB();
    }
}
