package com.JDb.compute;

public class LeetCode124 {

    int rs = Integer.MIN_VALUE;


    public int maxPathSum(TreeNode root) {
        dp(root);
        return rs;
    }

    private int dp(TreeNode root) {
        if (null == root) {
            return 0;
        }

        int left = Math.max(0, dp(root.left));
        int right = Math.max(0, dp(root.right));
        int lmr = root.val + left + right;
        int r = root.val + Math.max(left, right);
        rs = Math.max(rs, Math.max(lmr, r));
        return r;
    }

}
