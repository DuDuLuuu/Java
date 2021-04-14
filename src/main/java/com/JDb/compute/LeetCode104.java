package com.JDb.compute;

import java.util.ArrayList;
import java.util.List;

public class LeetCode104 {
    public int maxDepth(TreeNode root) {

        int rs = 0;

        List<TreeNode> c = new ArrayList<>();
        if (null == root) {
            return 0;
        }
        c.add(root);
        while (c.size() != 0) {
            List<TreeNode> temp = new ArrayList<>();
            for (TreeNode treeNode : c) {
                if (null != treeNode.left) {
                    temp.add(treeNode.left);
                }
                if (null != treeNode.right) {
                    temp.add(treeNode.right);
                }
            }
            rs++;
            c = temp;
        }
        return rs;
    }
}
