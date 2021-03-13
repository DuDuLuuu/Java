package com.JDb.compute;


import java.util.ArrayList;
import java.util.List;

public class LeetCode145 {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> rs = new ArrayList<>();
        dp(root, rs);
        return rs;
    }

    public void dp(TreeNode current, List<Integer> rs) {
        if (null == current) {
            return;
        }
        dp(current.left, rs);
        dp(current.right, rs);
        rs.add(current.val);
    }
}
