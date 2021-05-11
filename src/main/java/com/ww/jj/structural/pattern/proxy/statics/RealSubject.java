package com.ww.jj.structural.pattern.proxy.statics;
/**
 * 真实主题
 * @author wangzhijun
 * @date 2021/5/11 16:49
 */
public class RealSubject implements Subject{

    @Override
    public void userRequest() {
        System.out.println("静态代理---访问真实主题具体实现方法，操作目标内容。");
    }
}
