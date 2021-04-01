package com.JDb.compute;

import java.util.ArrayList;
import java.util.Collections;

public class LeetCode4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> l = new ArrayList<>();
        for (int k : nums1) {
            l.add(k);
        }
        for (int j : nums2) {
            l.add(j);
        }
        Collections.sort(l);
        int index = l.size() / 2;
        if (l.size() % 2 == 0) {
            return (double) (l.get(index) + l.get(index - 1)) / 2;
        }
        return l.get(index);
    }
}
