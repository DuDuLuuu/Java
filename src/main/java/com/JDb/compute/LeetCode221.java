package com.JDb.compute;

public class LeetCode221 {


    public int maximalSquare(char[][] matrix) {

        int x = matrix.length;
        int y = matrix[0].length;
        int[][] dp = new int[x][y];
        int rs = 0;
        for (int i = 0; i < x; i++) {
            dp[i][0] = matrix[i][0] == 49 ? 1 : 0;
            rs = Math.max(rs, dp[i][0]);
        }

        for (int i = 0; i < y; i++) {
            dp[0][i] = matrix[0][i] == 49 ? 1 : 0;
            rs = Math.max(rs, dp[0][i]);
        }

        for (int i = 1; i < x; i++) {
            for (int j = 1; j < y; j++) {
                if (matrix[i][j] == '0') {
                    dp[i][j] = 0;
                } else {
                    int left = 0;
                    for (int k = i - 1; k >= 0; k--) {
                        if (matrix[k][j] == '1') {
                            left++;
                        } else {
                            break;
                        }
                    }
                    int upper = 0;
                    for (int k = j - 1; k >= 0; k--) {
                        if (matrix[i][k] == '1') {
                            upper++;
                        } else {
                            break;
                        }
                    }

                    int upperLeft = dp[i - 1][j - 1];
                    if (left >= upperLeft && upper >= upperLeft) {
                        dp[i][j] = upperLeft + 1;
                    } else if (0 == upperLeft || 0 == left || 0 == upper) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = Math.min(left, upper) + 1;
                    }
                }
                rs = Math.max(rs, dp[i][j]);
            }
        }
        return rs * rs;
    }
}
