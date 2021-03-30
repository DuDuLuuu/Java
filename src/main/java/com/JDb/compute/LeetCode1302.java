package com.JDb.compute;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1302 {
    public int deepestLeavesSum(TreeNode root) {

        if (null == root) {
            return 0;
        }
        int rs = 0;
        List<TreeNode> list = new ArrayList<>();
        int size = -1;
        list.add(root);
        while (size != 0) {
            List<TreeNode> temp = new ArrayList<>();
            for (TreeNode treeNode : list) {
                if (null != treeNode.left) {
                    temp.add(treeNode.left);
                }
                if (null != treeNode.right) {
                    temp.add(treeNode.right);
                }
            }
            size = temp.size();
            if (size != 0) {
                list = temp;
            }
        }
        for (TreeNode treeNode : list) {
            rs += treeNode.val;
        }
        return rs;
    }
}
