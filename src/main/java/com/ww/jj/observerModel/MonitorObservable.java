package com.ww.jj.observerModel;

import lombok.Data;

import java.util.Observable;

/**
 * 消息监控、发送者
 *
 * @author wangzhijun
 * @date 2021/4/13 13:29
 */
@Data
public class MonitorObservable extends Observable {

    private String message;

    public void notify(String message) {
        this.message = message;

        //改变监控changed状态
        this.setChanged();

        //通知观察者
        this.notifyObservers();
    }
}
