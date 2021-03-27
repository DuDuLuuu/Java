package com.JDb.compute;

public class LeetCode222 {
    int rs = 0;

    public int countNodes(TreeNode root) {
        if (null == root) {
            return 0;
        } else {
            rs += 1;
        }
        countNodes(root.left);
        countNodes(root.right);
        return rs;
    }
}
