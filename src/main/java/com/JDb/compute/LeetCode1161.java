package com.JDb.compute;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:JDb
 * @Date:2019/9/4
 */

/**
 * 给你一个二叉树的根节点 root。设根节点位于二叉树的第 1 层，而根节点的子节点位于第 2 层，依此类推。

 请你找出层内元素之和 最大 的那几层（可能只有一层）的层号，并返回其中 最小 的那个。

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/maximum-level-sum-of-a-binary-tree
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode1161 {
    public int maxLevelSum(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        loop(root, list, 1);

        Integer rs = 0;
        Integer max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)>max) {
                rs=i;
                max = list.get(i);
            }
        }
        return rs+1;
    }

    public void loop(TreeNode curr, List<Integer> list,Integer level) {
        if (curr == null) {
            return ;
        }
        if (list.size()<level) {
            list.add(curr.val);
        } else {
            list.set(level - 1, list.get(level - 1) + curr.val);
        }
        loop(curr.left,list,level+1);
        loop(curr.right,list,level+1);
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(7);
        treeNode.left.left = new TreeNode(7);
        treeNode.left.right = new TreeNode(-8);
        treeNode.right = new TreeNode(0);

        LeetCode1161 obj = new LeetCode1161();
        int rs = obj.maxLevelSum(treeNode);
        System.out.println(rs);
    }
}
