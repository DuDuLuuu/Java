package com.JDb.compute;

import java.util.ArrayList;
import java.util.List;

public class LeetCode102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> rs = new ArrayList<>();
        dp(1, root, rs);
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
