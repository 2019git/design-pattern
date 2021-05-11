package com.ww.jj.structural.pattern.proxy.statics;

/**
 * 代理类
 * @author wangzhijun
 * @date 2021/5/11 16:53
 */
public class Proxy implements Subject{

    private RealSubject realSubject = new RealSubject();

    @Override
    public void userRequest() {
        before();
        realSubject.userRequest();
        after();
    }

    private void before(){
        System.out.println("访问真实主题之前的预处理。");
    }

    private void after(){
        System.out.println("访问真实主题之后的后续处理。");
    }
}
