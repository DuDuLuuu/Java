//package com.JDb.compute;
//
//import com.google.common.util.concurrent.ThreadFactoryBuilder;
//
//import java.io.IOException;
//import java.util.Scanner;
//import java.util.concurrent.*;
//
///**
// * @Author:JDb
// * @Date:2018/11/7
// */
//public class LeetCode {
//    public static void main(String[] args) throws IOException {
//        long starttime = System.currentTimeMillis();
//
//
//
//        LeetCode leetCode = new LeetCode();
//        String cmd = "cmd "+"/c "+"ipconfig/all";
//        Process process = Runtime.getRuntime().exec(cmd);
//        Scanner scanner = new Scanner(process.getInputStream());
//
//        while(scanner.hasNextLine()){
//            System.out.println(scanner.nextLine());
//        }
//        scanner.close();
//
//
//
//        long endtime = System.currentTimeMillis();
//        System.out.println("运行时间" + (endtime - starttime) + "ms");
//    }
//
//    public static void createThread() {
//        ThreadFactory namedThreadFactory = new ThreadFactoryBuilder()
//                .setNameFormat("demo-pool-%d").build();
//        ExecutorService singleThreadPool = new ThreadPoolExecutor(2, 2,
//                0L, TimeUnit.MILLISECONDS,
//                new LinkedBlockingQueue<>(1024), namedThreadFactory, new ThreadPoolExecutor.AbortPolicy());
//
//        singleThreadPool.execute(() -> {
//            try {
//                doSomething();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//        singleThreadPool.shutdown();
//    }
//
//    public static void doSomething() throws InterruptedException {
////        System.out.println(Thread.currentThread().getName());
//    }
//
//    //   static
//
//}
//
