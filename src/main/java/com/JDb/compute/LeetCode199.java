package com.JDb.compute;

import java.util.ArrayList;
import java.util.List;

public class LeetCode199 {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> rs = new ArrayList<>();
        if (null == root) {
            return rs;
        }
        ArrayList<TreeNode> c = new ArrayList<>();
        rs.add(root.val);
        c.add(root);
        while (c.size() != 0) {
            ArrayList<TreeNode> t = new ArrayList<>();
            for (TreeNode treeNode : c) {
                if (null != treeNode.left) {
                    t.add(treeNode.left);
                }
                if (null != treeNode.right) {
                    t.add(treeNode.right);
                }
            }
            if (0 != t.size()) {
                rs.add(t.get(t.size() - 1).val);
            }
            c = t;
        }
        return rs;
    }
}
