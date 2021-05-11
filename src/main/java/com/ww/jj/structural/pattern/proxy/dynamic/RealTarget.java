package com.ww.jj.structural.pattern.proxy.dynamic;

/**
 * 真实目标类---实现具体目标
 *
 * @author wangzhijun
 * @date 2021/5/11 17:30
 */
public class RealTarget implements Target {

    @Override
    public void requestTargetInfo() {
        System.out.println("动态代理---实现请求的具体目标操作AAAAAAAAAAAAAAAA。");
    }

    @Override
    public void requestTargetInfoB() {
        System.out.println("动态代理---实现请求的具体目标操作BBBBBBBBBBBBBBBBBB。");
    }
}
