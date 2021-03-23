package com.JDb.compute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

/**
 * @author JDb
 * @date 2021/3/22
 * @desc
 * @since app-version : 2.23
 */
public class LeetCode239 {
    public static void main(String[] args) {
        LeetCode239 leetCode239 = new LeetCode239();
        int[] ints = new int[]{9, 10, 9, -7, -4, -8, 2, -6};
        System.out.println(Arrays.toString(leetCode239.maxSlidingWindow(ints, 5)));
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        TreeMap<Integer, Integer> map = new TreeMap<>((o1, o2) -> o2 - o1);
        ArrayList<Integer> list = new ArrayList<>();
        int left = 0, right = 0;
        while (right < nums.length) {
            int r = nums[right];
            map.merge(r, 1, Integer::sum);
            right++;

            while (right - left > k) {
                int l = nums[left];
                if (1 == map.get(l)) {
                    map.remove(l);
                } else {
                    map.put(l, map.get(l) - 1);
                }
                left++;
            }
            if (right - left == k) {
                list.add(map.firstKey());
            }

        }
        int[] rs = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            rs[i] = list.get(i);
        }
        return rs;
    }
}
