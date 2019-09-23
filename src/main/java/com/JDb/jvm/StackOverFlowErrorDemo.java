package com.JDb.jvm;

/**
 * @Author:JDb
 * @Date:2019/5/7
 */
public class StackOverFlowErrorDemo {
    //-----------------------------第一种情况：方法调用层过多
    int stackCount = 0;
    public void doSomething() {
        stackCount++;
        //自调用、增加栈深度
        doSomething();
    }
    //-----------------------------第二种情况：同时存活的线程过多
//    int threadCount = 0;
//    public void doAnotherthing() {
//        while (true) {
//            threadCount++;
//            new Thread(new Runnable() {
//                public void run() {
//                    while (true) {
//                    }
//                }
//            }).start();
//        }
//    }

    public static void main(String[] args) {
        StackOverFlowErrorDemo obj = new StackOverFlowErrorDemo();
        //-------------测试第一种情况
        try {
            obj.doSomething();
        } catch (Throwable e) {
            System.out.println("栈深度：" + obj.stackCount);
            e.printStackTrace();
        }
        //-------------测试第二种情况
//        try {
//            obj.doAnotherthing();
//        } catch (Throwable e) {
//            System.out.println("同时存在的线程数量："+obj.threadCount);
//            e.printStackTrace();
//        }
    }
}
