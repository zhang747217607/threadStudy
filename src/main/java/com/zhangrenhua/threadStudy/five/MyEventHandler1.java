package com.zhangrenhua.threadStudy.five;

import com.lmax.disruptor.EventHandler;

/**
 * @author zhangrenhua
 * @title
 * @desc
 * @date 2018/9/1
 */


public class MyEventHandler1 implements EventHandler<MyEvent> {
    
    @Override
    public void onEvent(MyEvent myEvent, long l, boolean b) throws Exception {
        myEvent.setName(myEvent.getName() + " zhangsan");
        System.out.println("设置name =" + myEvent.getName());
    }
}
