package com.JDb.compute;

import java.util.ArrayList;
import java.util.List;

public class LeetCode230 {

    List<Integer> list = new ArrayList<>();
    int rs = 0;

    public int kthSmallest(TreeNode root, int k) {
        if (null != root.left) {
            kthSmallest(root.left, k);
        }
        list.add(root.val);
        if (list.size() == k) {
            rs = list.get(k - 1);
        }
        if (null != root.right) {
            kthSmallest(root.right, k);
        }
        return rs;
    }

}
