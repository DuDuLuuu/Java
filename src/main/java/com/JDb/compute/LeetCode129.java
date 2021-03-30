package com.JDb.compute;

import sun.java2d.pipe.SpanIterator;

import java.util.ArrayList;
import java.util.List;

public class LeetCode129 {
    int rs = 0;

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        LeetCode129 leetCode129 = new LeetCode129();
        leetCode129.sumNumbers(treeNode);
    }
    public int sumNumbers(TreeNode root) {
        if (null == root) {
            return 0;
        }
        sum(root, root.val);
        System.out.println(rs);
        return rs;
    }

    public void sum(TreeNode root, int s) {
        if (null == root.left && null == root.right) {
            rs += s ;
        }

        if (null != root.left) {
            sum(root.left, s * 10 + root.left.val);
        }
        if (null != root.right) {
            sum(root.right, s * 10 + root.right.val);
        }
    }
}
