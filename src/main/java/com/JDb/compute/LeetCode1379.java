package com.JDb.compute;

import java.util.ArrayList;
import java.util.Collections;

public class LeetCode1379 {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        return getRs(cloned, target);
    }

    public TreeNode getRs(TreeNode cloned, TreeNode target) {
        if (null == cloned) {
            return null;
        }
        if (cloned.val == target.val) {
            return cloned;
        }

        TreeNode left = getRs(cloned.left, target);
        if (null != left) {
            return left;
        }
        TreeNode right = getRs(cloned.right, target);
        return right;
    }
}
