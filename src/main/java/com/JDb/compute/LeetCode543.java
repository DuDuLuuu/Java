package com.JDb.compute;

public class LeetCode543 {


    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return rs;
    }

    int rs = 0;

    private int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        rs = Math.max(l + r, rs);
        return Math.max(l, r) + 1;
    }
}
