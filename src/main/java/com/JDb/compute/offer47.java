package com.JDb.compute;

public class offer47 {
    public int maxValue(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j > 0) {
                    dp[i][j] = dp[i][j - 1] + grid[i][j];
                    continue;
                }
                if (j == 0 && i > 0) {
                    dp[i][j] = dp[i - 1][j] + grid[i][j];
                    continue;
                }
                if (i > 0) {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]) + grid[i][j];
                }
            }
        }
        return dp[m - 1][n - 1];
    }
}
