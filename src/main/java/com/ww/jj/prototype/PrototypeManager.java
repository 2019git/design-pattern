package com.ww.jj.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * 原型管理器
 * @author wangzhijun
 * @date 2021/4/30 15:36
 */
public class PrototypeManager {

    private Map<String,Shape> map = new HashMap<>();

    public PrototypeManager() {
        map.put("circle", new Circle());
        map.put("square", new Square());
    }

    public Shape gainShape(String key){
        Shape shape = map.get(key);
        return (Shape)shape.clone();
    }
}
