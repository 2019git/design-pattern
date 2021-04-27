package com.ww.jj.observerModel;

import lombok.Data;

import java.util.Observable;
import java.util.Observer;

/**
 * 消息接收者
 *
 * @author wangzhijun
 * @date 2021/4/13 13:33
 */
@Data
public class MessageObserver implements Observer {

    private String name;

    private String message;

    public MessageObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        try {
            receiveMessage(o);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    private void receiveMessage(Observable o) {
        this.message = ((MonitorObservable) o).getMessage();
        if (this.name.equals("B")) {
            throw new RuntimeException("制造异常情况！");
        }
        System.out.println("我是接收者：" + this.name + ",我已接收到消息:" + this.message);
    }
}
