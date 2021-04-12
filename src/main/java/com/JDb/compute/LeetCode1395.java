package com.JDb.compute;

public class LeetCode1395 {
    public int numTeams(int[] rating) {
        int n = rating.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int l = 0;
            int r = 0;
            for (int j = 0; j < i; j++) {
                if (rating[j] < rating[i]) {
                    l++;
                }
            }
            for (int j = i + 1; j < n; j++) {
                if (rating[j] > rating[i]) {
                    r++;
                }
            }
            //下标从0开始时，左边的区间长度是i，右边的区间长度是n-(i+1)==n-i-1
            ans += l * r + (i - l) * (n - i - 1 - r);
        }
        return ans;
    }
}
