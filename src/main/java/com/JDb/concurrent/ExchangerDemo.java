package com.JDb.concurrent;

import com.sun.javafx.scene.control.skin.VirtualFlow;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Exchanger:泛型定义交换数据类型，线程A调用exchange进入等待状态，线程B调用exchange后唤醒前线程A
 * @Author:JDb
 * @Date:2019/9/3
 */
public class ExchangerDemo {
    public static void main(String[] args) throws InterruptedException {
        Integer threadCount = 2;
        ExecutorService threadPool = Executors.newFixedThreadPool(threadCount);
        Exchanger<String> exchanger = new Exchanger<>();
        final List<Thread> list = new Vector<>();
        threadPool.execute(() -> {
            try {
                list.add(Thread.currentThread());
                System.out.println("线程1 runing");
                String exchange = exchanger.exchange("线程1的数据，应该交换给线程2的内容");
                System.out.println("线程1：" + exchange);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        TimeUnit.SECONDS.sleep(2L);
        threadPool.execute(() -> {
            try {
                System.out.println("线程2 runing");
                String exchange = exchanger.exchange("线程2的数据，应该交换给线程1的内容");
                System.out.println("线程2：" + exchange);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        TimeUnit.SECONDS.sleep(1L);
        threadPool.shutdown();
    }
}

