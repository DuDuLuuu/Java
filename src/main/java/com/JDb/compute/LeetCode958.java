package com.JDb.compute;

import java.util.ArrayList;
import java.util.List;

public class LeetCode958 {

    public boolean isCompleteTree(TreeNode root) {
        if (null == root) {
            return false;
        }
        ArrayList<TreeNode> l = new ArrayList<>();
        l.add(root);
        boolean rs = true;
        boolean stop = false;
        while (l.size() != 0) {
            ArrayList<TreeNode> t = new ArrayList<>();
            for (TreeNode treeNode : l) {
                if (stop && treeNode.left != null) {
                    return false;
                }
                if (null != treeNode.left) {
                    t.add(treeNode.left);
                } else {
                    stop = true;
                }
                if (stop && treeNode.right != null) {
                    return false;
                }
                if (null != treeNode.right) {
                    t.add(treeNode.right);
                } else {
                    stop = true;
                }
            }
            l = t;
        }
        return rs;
    }
}
