package com.JDb.compute;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author JDb
 * @date 2021/3/30
 * @desc
 * @since app-version : 2.24
 */
public class LeetCode113 {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (null == root) {
            return rs;
        }
        list.addLast(root.val);
        sum(root, 0, targetSum, list);
        return rs;
    }

    List<List<Integer>> rs = new ArrayList<>();

    LinkedList<Integer> list = new LinkedList<>();

    private void sum(TreeNode root, int c, int targetSum, LinkedList<Integer> list) {


        if (null == root.left && null == root.right) {
            if (c + root.val == targetSum) {
                rs.add(new ArrayList<>(list));
            }
            return;
        }
        if (null != root.left) {
            list.addLast(root.left.val);
            sum(root.left, c + root.val, targetSum, list);
            list.removeLast();
        }
        if (null != root.right) {
            list.addLast(root.right.val);
            sum(root.right, c + root.val, targetSum, list);
            list.removeLast();
        }
    }
}
