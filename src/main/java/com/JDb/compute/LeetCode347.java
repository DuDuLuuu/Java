package com.JDb.compute;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class LeetCode347 {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>(nums.length);

        for (int num : nums) {
            Integer integer = map.putIfAbsent(num, 1);
            if (null != integer) {
                map.put(num, integer + 1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>(map.values());
        list.sort(Comparator.comparingInt(o -> o));

        Integer integer = list.get(list.size() - k);
        int[] rs = new int[k];
        int index=0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue()>=integer) {
                rs[index++] = entry.getKey();
            }
        }

        return rs;
    }
}
