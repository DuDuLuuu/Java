package com.JDb.compute;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author JDb
 * @date 2021/3/22
 * @desc
 * @since app-version : 2.23
 */
public class LeetCode41 {
    public int firstMissingPositive(int[] nums) {

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < nums.length + 1; i++) {
            set.add(i + 1);
        }
        for (int num : nums) {
            set.remove(num);
        }
        Iterator<Integer> iterator = set.iterator();
        return iterator.next();
    }
}
