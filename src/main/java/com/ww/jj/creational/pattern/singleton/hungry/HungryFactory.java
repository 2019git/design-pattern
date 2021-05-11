package com.ww.jj.creational.pattern.singleton.hungry;

import lombok.Data;

/**
 * 饿汉式单例
 * @author wangzhijun
 * @date 2021/4/28 16:33
 */
@Data
public class HungryFactory {

    /**
     * 饿汉式单例的特点是类一旦加载就创建一个单例，保证在调用 getInstance 方法之前单例已经存在了。
     */



    /**
     * 创建实例
     */
    private static final HungryFactory instance = new HungryFactory();


    /**
     * 构造函数
     */
    private HungryFactory(){}


    public static HungryFactory getInstance(){
        return instance;
    }


    /**
     * 饿汉式单例在类创建的同时就已经创建好一个静态的对象供系统使用，以后不再改变，所以是线程安全的，可以直接用于多线程而不会出现问题。
     */
}
