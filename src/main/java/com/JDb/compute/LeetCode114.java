package com.JDb.compute;

public class LeetCode114 {

    public TreeNode n;

    public void flatten(TreeNode root) {
        buildNode(root);
        root = n;
    }

    public void buildNode(TreeNode root) {
        if (root == null) {
            return;
        }
        flatten(root.right);
        flatten(root.left);

        if (null != n) {
            root.right = n;
            root.left = null;
        }
        n = root;
    }
}
