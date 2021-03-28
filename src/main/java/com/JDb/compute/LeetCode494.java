package com.JDb.compute;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;

public class LeetCode494 {

    public static void main(String[] args) {
        LeetCode494 leetCode494 = new LeetCode494();
        System.out.println(leetCode494.findTargetSumWays(new int[]{1, 0}, 1));
    }

    public int findTargetSumWays(int[] nums, int S) {
        dfs(nums, 0, S);
        return rs;
    }

    int rs = 0;

    private void dfs(int[] nums, int i, int s) {
        if (i == nums.length) {
            if (s == 0) {
                rs++;
            }
            return;
        }
        s += nums[i];
        dfs(nums, i + 1, s);
        s -= nums[i];

        s -= nums[i];
        dfs(nums, i + 1, s);
        s += nums[i];
    }
}
