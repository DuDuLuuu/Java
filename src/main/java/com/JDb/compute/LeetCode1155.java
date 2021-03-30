package com.JDb.compute;

import java.net.SocketTimeoutException;
import java.security.interfaces.RSAKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode1155 {


    Map<String, Integer> map = new HashMap<>();

    public int numRollsToTarget(int d, int f, int target) {
        if (null != map.get(target + "," + d)) {
            return map.get(target + "," + d);
        }
        if (d * f < target || target <= 0) {
            return 0;
        }
        if (d == 1) {
            if (f >= target) {
                return 1;
            } else {
                return 0;
            }
        }
        long rs = 0;
        for (int i = 1; i <= f; i++) {
            rs += numRollsToTarget(d - 1, f, target - i);
        }
        rs = rs % 1000000007;
        map.put(target + "," + d, Integer.valueOf(String.valueOf(rs)));
        return Integer.parseInt(String.valueOf(rs));
    }
}
