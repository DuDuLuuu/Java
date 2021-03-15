package com.JDb.compute;

import java.util.*;

public class LeetCode987 {
    HashMap<Integer, List<np>> map = new HashMap<>();
    int min = 0;

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(root, 0, 0);
        while (map.containsKey(min)) {
            List<np> list = map.get(min);
            list.sort((o1, o2) -> {
                if (o2.y != o1.y) return o2.y - o1.y;
                return o1.val - o2.val;
            });
            List<Integer> nums = new ArrayList<>();
            for (np n : list) nums.add(n.val);
            res.add(nums);
            min++;
        }
        return res;
    }

    public void dfs(TreeNode root, int x, int y) {
        if (root != null) {
            np n = new np(root.val, x, y);
            min = Math.min(min, x);
            if (map.containsKey(x)) map.get(x).add(n);
            else {
                List<np> list = new ArrayList<>();
                list.add(n);
                map.put(x, list);
            }
            dfs(root.left, x - 1, y - 1);
            dfs(root.right, x + 1, y - 1);
        }
    }

    public static class np {
        int val;
        int x;
        int y;

        public np(int val, int x, int y) {
            this.val = val;
            this.x = x;
            this.y = y;
        }
    }
}
