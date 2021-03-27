package com.JDb.compute;

import java.util.*;

/**
 * @author JDb
 * @date 2021/3/22
 * @desc
 * @since app-version : 2.23
 */
public class LeetCodeListOfDepth {

    public static void main(String[] args) {
        LeetCodeListOfDepth o = new LeetCodeListOfDepth();
        o.listOfDepth(new TreeNode(1));
    }

    public ListNode[] listOfDepth(TreeNode tree) {
        List<TreeNode> list = new ArrayList<>();
        list.add(tree);
        ArrayList<ListNode> rs = new ArrayList<>();
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
            ListNode listNode = null;
            ListNode current = null;
            for (TreeNode treeNode : list) {
                if (listNode == null) {
                    listNode = new ListNode(treeNode.val);
                    current = listNode;
                } else {
                    current.next = new ListNode(treeNode.val);
                    current = current.next;
                }
            }
            rs.add(listNode);
            list = temp;
        }
        ListNode[] listNodes = new ListNode[rs.size()];
        rs.toArray(listNodes);
        return listNodes;
    }

}
