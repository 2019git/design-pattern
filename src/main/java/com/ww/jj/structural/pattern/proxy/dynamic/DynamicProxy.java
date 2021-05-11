package com.ww.jj.structural.pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理类
 *
 * @author wangzhijun
 * @date 2021/5/11 17:32
 */
public class DynamicProxy implements InvocationHandler {

    private Target target;

    public Target getInstance(Target target) {
        this.target = target;
        Class<? extends Target> aClass = target.getClass();
        Object instance = Proxy.newProxyInstance(aClass.getClassLoader(), aClass.getInterfaces(), this::invoke);
        return (Target) instance;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        //调用真正的实现方法        RealTarget.requestTargetInfo()
        Object invoke = method.invoke(this.target, args);
        after();
        return invoke;
    }

    private void before() {
        System.out.println("访问具体方法之前的预处理。");
    }

    private void after() {
        System.out.println("访问具体方法之后的后续处理。");
    }

    @Override
    public String toString() {
        System.out.println("toString调用");
        return null;
    }
}
