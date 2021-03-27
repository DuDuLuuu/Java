package com.JDb.compute;

public class LeetCode814 {
    public static void main(String[] args) {
        TreeNode r = new TreeNode(1);
        r.right = new TreeNode(0);
        r.right.left = new TreeNode(0);
        r.right.right = new TreeNode(1);
        LeetCode814 o = new LeetCode814();
        o.pruneTree(r);
    }

    public TreeNode pruneTree(TreeNode root) {
        if (null == root) {
            return null;
        }
        return cantain(root)?root:new TreeNode(0);
    }

    private boolean cantain(TreeNode root) {
        if (null == root.left && null == root.right) {
            return root.val == 1;
        }
        boolean left = false;
        if (null != root.left) {
            left = cantain(root.left);
            if (!left) {
                root.left = null;
            }
        }
        boolean right = false;
        if (null != root.right) {
            right = cantain(root.right);
            if (!right) {
                root.right = null;
            }
        }
        return left | right | root.val == 1;
    }
}
