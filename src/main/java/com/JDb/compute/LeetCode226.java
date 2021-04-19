package com.JDb.compute;

public class LeetCode226 {

    public TreeNode mirrorTree(TreeNode root) {

        if (null == root) {
            return null;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }
}
