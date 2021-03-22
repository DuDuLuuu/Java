package com.JDb.compute;

import java.time.Duration;

public class LeetCode968 {


    public static void main(String[] args) {
        System.out.println((double)35954000/Duration.ofHours(12).toMillis());
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.left.right = new TreeNode(3);
        node.left.right.left = new TreeNode(4);
        node.left.right.left.right = new TreeNode(5);
        node.left.right.left.right.left = new TreeNode(6);
        LeetCode968 o = new LeetCode968();
        System.out.println(o.minCameraCover(node));
    }

    int rs = 0;

    public int minCameraCover(TreeNode root) {
        if (null == root.left && null == root.right) {
            return 1;
        }
        dp(root);
        return rs;
    }

    private int dp(TreeNode root) {
        if (null == root.left && null == root.right) {
            return 0;
        } else if (null == root.left) {
            if (0 == dp(root.right)) {
                rs++;
                return 1;
            } else {
                return 0;
            }
        } else if (null == root.right) {
            if (0 == dp(root.left)) {
                rs++;
                return 1;
            } else {
                return 0;
            }
        } else {
            if (0 == dp(root.left) | 0 == dp(root.right)) {
                rs++;
                return 1;
            } else {
                return 0;
            }
        }
    }

}
