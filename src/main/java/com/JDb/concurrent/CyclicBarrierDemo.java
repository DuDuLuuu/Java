package com.JDb.concurrent;

import java.util.concurrent.*;

/**
 * CyclicBarrier:线程调用await()进入阻塞状态，等待进入阻塞状态的线程达到CyclicBarrier构造函数指定参数的数量后，唤醒所有被阻塞线程
 * @Author:JDb
 * @Date:2019/8/30
 */
public class CyclicBarrierDemo {
    public static void main(String[] args) {
        Integer totalThreadCount = 5;
        Integer continueCount = 3;
        ExecutorService threadPool = Executors.newFixedThreadPool(totalThreadCount);
        CyclicBarrier cyclicBarrier = new CyclicBarrier(continueCount);
        for (int i = 0; i < totalThreadCount; i++) {
            final int index = i;
            threadPool.execute(() -> {
                String currentThread = Thread.currentThread().toString();
                System.out.println("当前线程:"+currentThread+",开始");
                if (index <continueCount-1 ) {
                    try {
                        System.out.println("当前线程:"+currentThread+"，进入阻塞等待唤醒");
                        cyclicBarrier.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (BrokenBarrierException e) {
                        e.printStackTrace();
                    }
                }

                try {
                    TimeUnit.SECONDS.sleep( 2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("--->当前线程:"+currentThread+",结束");
            });

        }

        System.out.println("==============等待"+(continueCount-1)+"个线程进入阻塞状态==============");
        try {
            TimeUnit.SECONDS.sleep(5);
            System.out.println("当前进入阻塞的线程数量为："+cyclicBarrier.getNumberWaiting());
            cyclicBarrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
        System.out.println("=============="+(continueCount-1)+"个线程进入阻塞状态：唤醒==============");


        threadPool.shutdown();
    }
}
