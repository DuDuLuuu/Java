package com.JDb.concurrent;


/**
 * @Author:JDb
 * @Date:2019/9/17
 */
public class synDemo1 {
    volatile static int num=1;
    public static void main(String[] args) {
        //两个线程轮流打印1-10
        Object lock = new Object();
        new Thread(() -> {
            while (num < 11) {
                synchronized (lock) {
                    System.out.println("当前线程：" + Thread.currentThread() + " " + num++);
                    lock.notifyAll();
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        new Thread(() -> {
            while (num < 11) {
                synchronized (lock) {
                    System.out.println("当前线程：" + Thread.currentThread() + " " + num++);
                    lock.notifyAll();
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

    }
}
