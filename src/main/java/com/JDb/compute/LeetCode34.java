package com.JDb.compute;

public class LeetCode34 {


    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }
        int left = 0;
        int right = nums.length - 1;
        int contain = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                contain = mid;
                break;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        if (contain == -1) {
            return new int[]{-1, -1};
        }


        int[] rs = new int[2];
        for (int i = contain; i < nums.length; i++) {
            if (nums[i] == target) {
                rs[1] = i;
            } else {
                break;
            }
        }
        for (int i = contain; i >= 0; i--) {
            if (nums[i] == target) {
                rs[0] = i;
            } else {
                break;
            }
        }
        return rs;
    }
}
