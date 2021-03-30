package com.JDb.compute;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode1641 {
    public int countVowelStrings(int n) {
        int rs = 0;
        for (Integer value : getCount(n).values()) {
            rs += value;
        }
        return rs;
    }

    private Map<String, Integer> getCount(int n) {
        if (n == 1) {
            Map<String, Integer> map = new HashMap<>();
            map.put("a", 1);
            map.put("e", 1);
            map.put("i", 1);
            map.put("o", 1);
            map.put("u", 1);
            return map;
        }
        Map<String, Integer> oldMap = getCount(n - 1);
        Map<String, Integer> newMap = new HashMap<>();
        newMap.put("a", oldMap.get("a") + oldMap.get("e") + oldMap.get("i") + oldMap.get("o") + oldMap.get("u"));
        newMap.put("e", oldMap.get("e") + oldMap.get("i") + oldMap.get("o") + oldMap.get("u"));
        newMap.put("i", oldMap.get("i") + oldMap.get("o") + oldMap.get("u"));
        newMap.put("o", oldMap.get("o") + oldMap.get("u"));
        newMap.put("u", oldMap.get("u"));
        return newMap;
    }
}
