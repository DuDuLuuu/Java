package com.JDb.compute;

import java.util.HashMap;
import java.util.Map;

public class LeetCode837 {

    public static void main(String[] args) {
        LeetCode837 leetCode837 = new LeetCode837();
        System.out.println(leetCode837.new21Game(21,17,10));
    }
    public double new21Game(int N, int K, int W) {
        if (K == 0) {
            return 1.0;
        }
        double[] dp = new double[K + W];
        for (int i = K; i <= N && i < K + W; i++) {
            dp[i] = 1.0;
        }
        for (int i = K - 1; i >= 0; i--) {
            for (int j = 1; j <= W; j++) {
                dp[i] += dp[i + j] / W;
            }
        }
        return dp[0];
    }
}
