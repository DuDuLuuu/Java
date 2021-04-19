package com.JDb.compute;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode1282 {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {

        HashMap<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> rs = new ArrayList<>();
        for (int i = 0; i < groupSizes.length; i++) {
            int v = groupSizes[i];
            List<Integer> list = map.get(v);
            if (null == list) {
                list = new ArrayList<>();
                list.add(i);
                map.put(v, list);
            } else {
                list.add(i);
            }
            if (list.size() == v) {
                rs.add(list);
                map.remove(v);
            }
        }
        return rs;
    }
}
