package com.JDb.compute;

public class LeetCode101 {

    public boolean isSymmetric(TreeNode root) {
        if (null == root) {
            return true;
        }
        return isSame(root.left, root.right);
    }

    private boolean isSame(TreeNode l, TreeNode r) {
        if (null == l && null == r) {
            return true;
        } else if (null != l && null != r) {
            if (l.val == r.val) {
                return isSame(l.left, r.right) && isSame(l.right, r.left);
            } else {
                return false;
            }
        } else {
            return false;
        }
    }


}
