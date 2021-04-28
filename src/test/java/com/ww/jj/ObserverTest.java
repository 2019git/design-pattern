package com.ww.jj;

import com.ww.jj.observer.model.MessageObserver;
import com.ww.jj.observer.model.MonitorObservable;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * 观察者模式测试类
 *
 * @author wangzhijun
 * @date 2021/4/13 13:42
 */
//@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class ObserverTest {

    @Test
    public void send() {
        MonitorObservable monitorObservable = new MonitorObservable();
        monitorObservable.addObserver(new MessageObserver("A"));
        monitorObservable.addObserver(new MessageObserver("B"));
        monitorObservable.addObserver(new MessageObserver("C"));
        monitorObservable.notify("观察者模式测试！");
    }
}
