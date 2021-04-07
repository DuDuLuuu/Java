package com.JDb.compute;

/**
 * @author JDb
 * @date 2021/3/30
 * @desc
 * @since app-version : 2.24
 */
public class LeetCode112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (null == root) {
            return rs;
        }
        sum(root, 0, targetSum);
        return rs;
    }

    boolean rs = false;

    private void sum(TreeNode root, int c, int targetSum) {

        if (rs) {
            return;
        }
        if (null == root.left && null == root.right) {
            if (c + root.val == targetSum) {
                rs = true;
            }
            return;
        }
        if (null != root.left) {
            sum(root.left, c + root.val, targetSum);
        }
        if (null != root.right) {
            sum(root.right, c + root.val, targetSum);
        }
    }
}
