package com.JDb.compute;

import javax.smartcardio.TerminalFactory;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode513 {

    public int findBottomLeftValue(TreeNode root) {

        List<TreeNode> list = new ArrayList<>();

        list.add(root);
        int rs = root.val;
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
            if (temp.size() != 0) {
                rs = temp.get(0).val;
            }
            list = temp;
        }
        return rs;
    }
}
