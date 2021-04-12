package com.JDb.compute;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

public class LeetCode1689 {

    public static void main(String[] args) {

        LeetCode1689 leetCode1689 = new LeetCode1689();
        System.out.println(leetCode1689.minPartitions("32"));
    }
    public int minPartitions(String n) {

        char[] chars = n.toCharArray();
        int max =0;
        for (char aChar : chars) {
            max = Math.max(max, aChar);
        }
        return Integer.parseInt(String.valueOf((char) max));
    }
}
