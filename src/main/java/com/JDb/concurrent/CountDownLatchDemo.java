package com.JDb.concurrent;

import java.util.Random;
import java.util.concurrent.*;


/**
 * CountDownLatch：某线程调用await()阻塞，直到其他线程调用countDown()累计到指定参数次数才唤醒被阻塞线程
 *
 * @author JDb
 */
public class CountDownLatchDemo {

    public static void main(String[] args) {
        Integer totalThreadCount = 5;
        Integer stopCount = 2;
        ExecutorService threadPool = Executors.newFixedThreadPool(totalThreadCount);
        final CountDownLatch countDownLatch = new CountDownLatch(stopCount);
        for (int i = 0; i < totalThreadCount; i++) {
            final int index=i;
            threadPool.execute(() -> {
                String currentThread = Thread.currentThread().toString();
                System.out.println("当前线程:"+currentThread+",开始");

                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (index <stopCount) {
                    //累加
                    countDownLatch.countDown();
                    System.out.println("--->当前线程:"+currentThread+",调用 countDown()");
                }
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("--->当前线程:"+currentThread+",结束");

            });
        }
        System.out.println("==============等待"+stopCount+"个线程调用CountDown()：当前线程阻塞==============");
        try {
            //进入阻塞
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("=============="+stopCount+"个线程调用CountDown()：当前线程唤醒==============");
        threadPool.shutdown();
    }
}


