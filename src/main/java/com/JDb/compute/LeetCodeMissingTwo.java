package com.JDb.compute;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author JDb
 * @date 2021/3/22
 * @desc
 * @since app-version : 2.23
 */
public class LeetCodeMissingTwo {
    public int[] missingTwo(int[] nums) {

        Set<Integer> set = new HashSet<>(nums.length + 2);
        for (int i = 0; i < nums.length + 2; i++) {
            set.add(i + 1);
        }
        for (int num : nums) {
            set.remove(num);
        }
        int[] rs = new int[2];
        Iterator<Integer> iterator = set.iterator();
        rs[0] = iterator.next();
        rs[1] = iterator.next();
        return rs;
    }
}
