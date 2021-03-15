package com.JDb.compute;

public class LeetCode1028 {

    int i = 0;

    public TreeNode recoverFromPreorder(String s) {
        return buildTree(s, 0);

    }

    public TreeNode buildTree(String s, int depth) {
        if (i == s.length()) {
            return null;
        }
        TreeNode cur = null;
        int begin = i;
        while (s.charAt(begin) == '-') {
            begin++;
        }
        int end = begin;
        while (end < s.length() && s.charAt(end) > 47 && s.charAt(end) < 58) {
            end++;
        }
        if (begin - i == depth) {
            cur = new TreeNode(Integer.parseInt(s.substring(begin, end)));
            i = end;
        }
        if (cur != null) {
            cur.left = buildTree(s, depth + 1);
            cur.right = buildTree(s, depth + 1);
        }
        return cur;
    }


}
