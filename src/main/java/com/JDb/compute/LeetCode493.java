package com.JDb.compute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class LeetCode493 {
    public int reversePairs(int[] nums) {
        int rs = 0;
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((long) nums[i] > (long) 2 * nums[j]) {
                    rs++;
                }
            }
        }
        return rs;
    }

}
