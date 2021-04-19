package com.JDb.compute;

public class LeetCode1551 {

    // 3=2
    // 5=2+4

    //2 =1
    //4 =1+3
    //6 =1+3+5
    //8 =1+3+5+7
    public static void main(String[] args) {
        LeetCode1551 leetCode1551 = new LeetCode1551();
        // System.out.println(leetCode1551.minOperations(3));
        System.out.println(leetCode1551.minOperations(6));
    }

    public int minOperations(int n) {

        int[] ints = new int[n + 1];
        ints[1] = 0;
        ints[2] = 1;

        for (int i = 3; i <= n; i++) {
            ints[i] = ints[i - 2] + i - 1;
        }
        return ints[n];
    }
}
