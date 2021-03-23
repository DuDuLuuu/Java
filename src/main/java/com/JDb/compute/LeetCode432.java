package com.JDb.compute;

import java.util.*;

/**
 * @author JDb
 * @date 2021/3/23
 * @desc
 * @since app-version : 2.23
 */
public class LeetCode432 {

    Map<String, Integer> map;
    TreeMap<Integer, Set<String>> map2;

    /**
     * Initialize your data structure here.
     */
    public LeetCode432() {
        map = new HashMap<>();
        map2 = new TreeMap<>((o1, o2) -> o2 - o1);
    }

    /**
     * Inserts a new key <Key> with value 1. Or increments an existing key by 1.
     */
    public void inc(String key) {
        Integer val = map.get(key);
        if (null == val) {
            //不存在key 新建
            map.put(key, 1);
            Set<String> val2 = map2.get(1);
            if (null == val2) {
                HashSet<String> set = new HashSet<>();
                set.add(key);
                map2.put(1, set);
            } else {
                val2.add(key);
            }
        } else {
            //存在 递增
            map.put(key, val + 1);
            //删除旧的
            Set<String> val3 = map2.get(val);
            if (null != val3) {
                val3.remove(key);
                if (val3.size() == 0) {
                    map2.remove(val);
                }
            }
            //创建新的
            Set<String> val4 = map2.get(val + 1);
            if (null == val4) {
                HashSet<String> set = new HashSet<>();
                set.add(key);
                map2.put(val + 1, set);
            } else {
                val4.add(key);
            }
        }
    }

    /**
     * Decrements an existing key by 1. If Key's value is 1, remove it from the data structure.
     */
    public void dec(String key) {
        Integer val = map.get(key);
        if (null != val) {
            if (val == 1) {
                map.remove(key);
                Set<String> val2 = map2.get(1);
                val2.remove(key);
                if (val2.size() == 0) {
                    map2.remove(1);
                }
            } else {
                map.put(key, val - 1);
                //删除旧的
                Set<String> val3 = map2.get(val);
                if (null != val3) {
                    val3.remove(key);
                    if (val3.size() == 0) {
                        map2.remove(val);
                    }
                }
                // 创建新的
                Set<String> val4 = map2.get(val - 1);
                if (null == val4) {
                    HashSet<String> set = new HashSet<>();
                    set.add(key);
                    map2.put(val-1, set);
                } else {
                    val4.add(key);
                }
            }
        }
    }

    /**
     * Returns one of the keys with maximal value.
     */
    public String getMaxKey() {
        if (map2.size() == 0) {
            return "";
        }
        return map2.get(map2.firstKey()).iterator().next();
    }

    /**
     * Returns one of the keys with Minimal value.
     */
    public String getMinKey() {
        if (map2.size() == 0) {
            return "";
        }
        return map2.get(map2.lastKey()).iterator().next();
    }
}
