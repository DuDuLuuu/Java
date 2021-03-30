package com.JDb.compute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class LeetCode105 {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> inMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inMap.put(inorder[i], i);
        }
        return buildTree(preorder, 0, preorder.length - 1, 0, inorder.length - 1, inMap);
    }

    private TreeNode buildTree(int[] preorder, int pLeft, int pRight,
                               int iLeft, int iRight, HashMap<Integer, Integer> inMap) {
        if (pRight < pLeft) {
            return null;
        }
        int inRootIndex = inMap.get(preorder[pLeft]);
        TreeNode root = new TreeNode(preorder[pLeft]);
        root.left = buildTree(preorder, pLeft + 1, inRootIndex - iLeft + pLeft,
                iLeft, inRootIndex - 1, inMap);
        root.right = buildTree(preorder, inRootIndex - iLeft + pLeft + 1, pRight,
                inRootIndex + 1, iRight, inMap);
        return root;
    }

}
