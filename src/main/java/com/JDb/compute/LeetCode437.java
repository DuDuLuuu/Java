package com.JDb.compute;

/**
 * @author JDb
 * @date 2021/3/30
 * @desc
 * @since app-version : 2.24
 */
public class LeetCode437 {
    public static void main(String[] args) {
    }

    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        return findPath(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    private int findPath(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        sum -= root.val;
        return ((sum == 0) ? 1 : 0) +
                findPath(root.left, sum) + findPath(root.right, sum);
    }
}
