package com.JDb.compute;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class LeetCode1315 {

    int rs = 0;

    public int sumEvenGrandparent(TreeNode root) {

        if (null == root) {
            return 0;
        }
        if (root.val % 2 == 0) {
            if (null != root.left) {
                TreeNode left = root.left;
                if (null != left.left) {
                    rs += left.left.val;
                }
                if (null != left.right) {
                    rs += left.right.val;
                }
            }
            if (null != root.right) {
                TreeNode right = root.right;
                if (null != right.left) {
                    rs += right.left.val;
                }
                if (null != right.right) {
                    rs += right.right.val;
                }
            }
        }
        sumEvenGrandparent(root.left);
        sumEvenGrandparent(root.right);
        return rs;
    }

}
