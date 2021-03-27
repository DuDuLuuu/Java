package com.JDb.compute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LeetCode515 {
    public List<Integer> largestValues(TreeNode root) {
        if (null == root) {
            return new ArrayList<>();
        }
        List<TreeNode> list = new ArrayList<>();
        list.add(root);
        List<Integer> rs = new ArrayList<>();
        while (list.size() != 0) {
            List<TreeNode> temp = new ArrayList<>();
            for (TreeNode treeNode : list) {
                if (null != treeNode.left) {
                    temp.add(treeNode.left);
                }
                if (null != treeNode.right) {
                    temp.add(treeNode.right);
                }
            }
            rs.add(list.stream().map(i -> i.val).max(Integer::compare).get());
            list = temp;
        }
        return rs;
    }
}
