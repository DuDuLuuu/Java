package com.JDb.compute;

public class LeetCode1038 {

    int sum = 0;

    public TreeNode bstToGst(TreeNode root) {
        if (null == root) {
            return null;
        }
        root.right = bstToGst(root.right);
        root.val += sum;
        sum = root.val;
        root.left = bstToGst(root.left);

        return root;
    }
}

