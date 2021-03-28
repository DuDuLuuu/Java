package com.JDb.compute;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1325 {

    public TreeNode removeLeafNodes(TreeNode root, int target) {

        if (null == root) {
            return null;
        }
        if (null == root.left && null == root.right && root.val == target) {
            return null;
        }

        root.left = removeLeafNodes(root.left, target);
        root.right = removeLeafNodes(root.right, target);


        if (null == root.left && null == root.right && root.val == target) {
            return null;
        }
        return root;
    }

}
