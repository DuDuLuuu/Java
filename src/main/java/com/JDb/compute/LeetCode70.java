package com.JDb.compute;

public class LeetCode70 {
    public int climbStairs(int n) {

        int[] dp = new int[n+1];
        dp[1] = 1;
        if (n <= 1) {
            return dp[n];
        }
        dp[2] = 2;
        if (n <= 2) {
            return dp[n];
        }
        for (int i = 3; i < n+1; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
