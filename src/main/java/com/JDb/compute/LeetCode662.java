package com.JDb.compute;

import java.util.ArrayList;
import java.util.List;

public class LeetCode662 {
    private int maxW = 0;

    public int widthOfBinaryTree(TreeNode root) {
        dfs(root, 1, 1, new ArrayList<>());
        return maxW;
    }

    private void dfs(TreeNode r, int level, int index, List<Integer> left) {
        if(r == null) return;
        if(level > left.size()) left.add(index);
        maxW = Math.max(maxW, index - left.get(level-1) + 1);
        dfs(r.left, level+1, index*2, left);
        dfs(r.right, level+1, index*2+1, left);
    }
}
