package com.JDb.compute;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LeetCode200 {

    public static void main(String[] args) {
        LeetCode200 leetCode200 = new LeetCode200();
        System.out.println(leetCode200.numIslands(new char[][]{
                // {'1', '1', '1', '1', '0'},
                // {'1', '1', '0', '1', '0'},
                // {'1', '1', '0', '0', '0'},
                // {'0', '0', '0', '0', '0'}
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}

        }));

    }

    public int numIslands(char[][] grid) {
        HashMap<String, Integer> map = new HashMap<>(8);
        int rs = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                char c = grid[i][j];
                if (c == 49) {
                    //判断左边和上
                    int i1 = i - 1;
                    int j1 = j - 1;
                    Integer v1 = map.get(i1 + "," + j);
                    Integer v2 = map.get(i + "," + j1);
                    if (null != v1 && null != v2) {
                        if (v1.equals(v2)) {
                            map.put(i + "," + j, v1);
                        } else {
                            //洗
                            int min = Math.min(v1, v2);
                            int max = Math.max(v1, v2);
                            map.put(i + "," + j, min);
                            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                                if (entry.getValue().equals(max)) {
                                    entry.setValue(min);
                                }
                            }
                        }
                    } else if (null != v2) {
                        map.put(i + "," + j, v2);
                    } else if (null != v1) {
                        map.put(i + "," + j, v1);
                    } else {
                        map.put(i + "," + j, rs++);
                    }
                }
            }
        }
        return new HashSet<>(map.values()).size();
    }

}
