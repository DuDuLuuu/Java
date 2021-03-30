package com.JDb.compute;

import java.util.HashSet;
import java.util.Set;

public class LeetCode1261 {


    class FindElements {
        Set<Integer> set = new HashSet<>();

        public FindElements(TreeNode root) {
            find(root);
        }

        private void find(TreeNode root) {
            if (root.val == -1) {
                root.val = 0;
                set.add(0);
            }
            if (null != root.left) {
                root.left.val = root.val * 2 + 1;
                set.add(root.left.val);
                find(root.left);
            }
            if (null != root.right) {
                root.right.val = root.val * 2 + 2;
                set.add(root.right.val);
                find(root.right);
            }
        }

        public boolean find(int target) {
            return set.contains(target);
        }
    }

}
