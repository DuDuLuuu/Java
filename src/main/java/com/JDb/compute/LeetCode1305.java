package com.JDb.compute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode1305 {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {

        ArrayList<Integer> rs = new ArrayList<>();
        buildList(root1, rs);
        buildList(root2, rs);
        Collections.sort(rs);
        return rs;
    }

    public void buildList(TreeNode node, ArrayList<Integer> list) {
        if (null != node) {
            list.add(node.val);
        } else {
            return;
        }
        buildList(node.left, list);
        buildList(node.right, list);
    }
}
