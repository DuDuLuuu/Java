package com.JDb.compute;

public class LeetCode312 {

    public int maxCoins(int[] nums) {

        int size = nums.length;
        int[][] dp = new int[size + 2][size + 2];

        int[] temp = new int[size + 2];
        temp[0] = 1;
        temp[size + 1] = 1;
        for (int i = 0; i < size; i++) {
            temp[i + 1] = nums[i];
        }

        for (int len = 3; len <= size + 2; len++) {
            for (int l = 0; l <= size + 2 - len; l++) {
                int max = 0;
                int r = l + len - 1;
                for (int k = l + 1; k < r; k++) {
                    int left = dp[l][k];
                    int right = dp[k][r];
                    max = Math.max(max, left + right + temp[l] * temp[k] * temp[r]);
                }
                dp[l][r] = max;
            }
        }
        return dp[0][size + 1];
    }
}
