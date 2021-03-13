package com.JDb.compute;


import java.util.ArrayList;
import java.util.List;

public class LeetCode144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> rs = new ArrayList<>();
        dp(root, rs);
        return rs;
    }

    public void dp(TreeNode current, List<Integer> rs) {
        if (null == current) {
            return;
        }
        rs.add(current.val);
        dp(current.left, rs);
        dp(current.right, rs);
    }
}
