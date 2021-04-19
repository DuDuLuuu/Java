package com.JDb.compute;

import java.util.Arrays;

public class LeetCode1402 {

    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        if (satisfaction.length == 0 || satisfaction[satisfaction.length - 1] < 0) {
            return 0;
        }

        int[] dp = new int[satisfaction.length];
        int rs = 0;
        dp[0] = satisfaction[satisfaction.length - 1];
        int sum = dp[0];

        for (int i = 1; i < satisfaction.length; i++) {
            dp[i] = dp[i - 1] + sum + satisfaction[satisfaction.length - 1 - i];
            sum += satisfaction[satisfaction.length - 1 - i];
            rs = Math.max(rs, dp[i]);
        }
        return rs;
    }
}
