package com.JDb.compute;

import java.util.ArrayList;
import java.util.List;

public class LeetCode173 {

}

class BSTIterator {


    public BSTIterator(TreeNode root) {
        buildList(root);
    }

    List<Integer> l = new ArrayList();
    int index = 0;

    private void buildList(TreeNode root) {
        if (root.left != null) {
            buildList(root.left);
        }
        l.add(root.val);
        if (root.right != null) {
            buildList(root.right);
        }

    }

    public int next() {
        return l.get(index++);
    }

    public boolean hasNext() {
        return index < l.size();
    }
}