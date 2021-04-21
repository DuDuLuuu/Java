package com.JDb.compute;

import java.util.Arrays;
import java.util.PriorityQueue;

public class LeetCode215 {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];

    }
}
