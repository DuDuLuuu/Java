package com.JDb.concurrent;


import java.util.Map;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Semaphore:构造参数指定许可数量，只有获取许可的线程允许执行，否则阻塞
 * @Author:JDb
 * @Date:2019/9/3
 */
public class SemaphoreDemo {
    public static void main(String[] args) throws InterruptedException {

        Integer semaphoreCount = 2;
        Integer threadCount = 5;

        final Semaphore semaphore = new Semaphore(semaphoreCount);

//        //获取许可 默认1个（可指定数量
//        semaphore.acquire();
//        //获取剩余可用许可数量
//        semaphore.availablePermits();
//        //获取并清空剩余可用许可
//        semaphore.drainPermits();
//        //释放许可 默认1个（可指定数量
//        semaphore.release();
//        //阻塞获取许可，不允许被打断
//        semaphore.acquireUninterruptibly();
//        //尝试获取许可（可以指定超时时间
//        semaphore.tryAcquire();
//        //获取等待许可的线程数
//        semaphore.getQueueLength();
//        //是否有线程等待获取许可
//        semaphore.hasQueuedThreads();


        ExecutorService threadPool = Executors.newFixedThreadPool(threadCount,new MyThreadFactory());
        Map<String, Integer> map = new ConcurrentHashMap<>(10);
        for (int i = 0; i < threadCount; i++) {
            TimeUnit.SECONDS.sleep(1L);
            threadPool.execute(new Task(semaphore, map));
        }
        threadPool.shutdown();
    }
}

class MyThreadFactory implements ThreadFactory {

    AtomicInteger index = new AtomicInteger();
    @Override
    public Thread newThread(Runnable r) {
        String name =""+index.addAndGet(1);
        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
        return new Thread(threadGroup,r,name,0);
    }
}
class Task implements Runnable {
    Semaphore semaphore;
    Map<String, Integer> map;

    Task(Semaphore semaphore, Map<String, Integer> map) {
        this.semaphore = semaphore;
        this.map = map;
    }

    @Override
    public void run() {
        String currentThread = Thread.currentThread().toString();
        //获取许可
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        map.put(currentThread, 1);
        //打印
        System.out.println("当前线程:" + currentThread + "【获取】信号量，已获取信号："+map.keySet()+",剩余可用信号量：" + semaphore.availablePermits());
        semaphore.getQueueLength();

        try {
            TimeUnit.SECONDS.sleep(2L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //释放许可
        semaphore.release();
        map.remove(currentThread);
        System.out.println("当前线程:" + currentThread + "<<释放>>信号量，已获取信号："+map.keySet()+",剩余可用信号量：" + semaphore.availablePermits());
    }
}