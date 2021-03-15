package com.JDb.compute;

public class LeetCode404 {
    Integer rs = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        dp(root);
        return rs;
    }


    public void dp(TreeNode current) {
        if (null == current) {
            return;
        }
        if (null != current.left && null == current.left.left && null == current.left.right) {
            rs += current.left.val;
        }

        dp(current.left);
        dp(current.right);
    }
}
