package com.JDb.compute;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LeetCode103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> rs = new ArrayList<>();
        dp(1, root, rs);
        for (int i = 0; i < rs.size(); i++) {
            if (i%2==1) {
                Collections.reverse(rs.get(i));
            }
        }
        return rs;
    }

    public void dp(int i, TreeNode current, List<List<Integer>> rs) {
        if (null == current) {
            return;
        }
        if (rs.size() < i) {
            rs.add(new ArrayList<>());
        }
        rs.get(i - 1).add(current.val);
        if (null != current.left) {
            dp(i + 1, current.left, rs);
        }
        if (null != current.right) {
            dp(i + 1, current.right, rs);
        }
    }
}
