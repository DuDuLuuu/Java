package com.JDb.jvm;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author:JDb
 * @Date:2019/5/7
 */
public class HeapOutOfMemoryErrorDemo {
    //----------------------------------java.lang.OutOfMemoryError: Java heap space
    //第一种情况：为对象分配的内存过大超出限制
    //第二种情况：分配的对象过多，导致累计的内存量超出限制
    int size = Integer.MAX_VALUE / 204;
    int[] arr = new int[size];

    public static void main(String[] args) {
        int instanceCount = 0;
        List list = new LinkedList();
        //测试JVM堆内存溢出
        try {
            while (true) {
                instanceCount++;
                list.add(new HeapOutOfMemoryErrorDemo());
                System.out.println(instanceCount);
            }
        } catch (Throwable e) {
            System.out.println("对象个数：" + instanceCount);
            e.printStackTrace();
        }
    }
}
