package com.JDb.compute;

public class LeetCode114 {

    public static void main(String[] args) {
        TreeNode r = new TreeNode(1);
        r.left = new TreeNode(2);
        r.left.left = new TreeNode(3);
        r.left.right = new TreeNode(4);
        r.right = new TreeNode(5);
        r.right.right = new TreeNode(6);
        LeetCode114 leetCode114 = new LeetCode114();
        leetCode114.flatten(r);
    }

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
