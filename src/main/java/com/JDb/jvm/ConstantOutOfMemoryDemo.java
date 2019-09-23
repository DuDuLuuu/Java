package com.JDb.jvm;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author:JDb
 * @Date:2019/5/7
 */
public class ConstantOutOfMemoryDemo {
    //----------------------------------java.lang.OutOfMemoryError: Java heap space
    public static void main(String[] args) {
        try {
            List list = new LinkedList<>();
            int i = 0;
            while (true) {
//                System.out.println(i);
                list.add(String.valueOf(i++).intern());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
