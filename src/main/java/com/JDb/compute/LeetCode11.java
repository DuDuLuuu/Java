package com.JDb.compute;

public class LeetCode11 {
    public static void main(String[] args) {

        LeetCode11 leetCode11 = new LeetCode11();
        leetCode11.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
    }

    public int maxArea(int[] height) {

        int rs = 0;
        int i = 0, j = height.length - 1;
        while (i != j) {
            rs = Math.max(rs,(j - i) * Math.min(height[i], height[j]));
            if (height[i] > height[j]) {
                j--;
            } else {
                i++;
            }
        }
        return rs;
    }
}
