package com.JDb.compute;

public class LeetCode647 {
    public int countSubstrings(String s) {
        char[] arr = s.toCharArray();
        int len = arr.length;
        boolean[][] dp = new boolean[len][len];

        int rs = 0;
        for (int j = 0; j < len; j++) {
            for (int i = 0; i <= j; i++) {
                if (i == j) {
                    dp[i][j] = true;
                    rs++;
                } else if (j - i == 1 && arr[i] == arr[j]) {
                    dp[i][j] = true;
                    rs++;
                } else if (j - i > 1 && arr[i] == arr[j] && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    rs++;
                }
            }
        }
        return rs;
    }

}
