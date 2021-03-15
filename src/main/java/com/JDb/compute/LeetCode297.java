package com.JDb.compute;

public class LeetCode297 {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {

        StringBuilder rs = new StringBuilder();
        doSerialize(rs, root);
        return rs.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] split = data.split(",");
        TreeNode rs = doDeserialize(split);
        index = 0;
        return rs;
    }

    Integer index = 0;

    void doSerialize(StringBuilder s, TreeNode current) {
        if (null == current) {
            s.append("null,");
            return;
        }
        s.append(current.val);
        s.append(",");
        doSerialize(s, current.left);
        doSerialize(s, current.right);
    }

    TreeNode doDeserialize(String[] val) {
        String s = val[index];
        TreeNode c;
        if (!"null".equals(s)) {
            c = new TreeNode(Integer.parseInt(s));
        }else {
            index++;
            return null;
        }
        index++;
        c.left = doDeserialize(val);
        c.right = doDeserialize(val);
        return c;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        LeetCode297 leetCode297 = new LeetCode297();
        TreeNode deserialize = leetCode297.deserialize(leetCode297.serialize(root));
        System.out.println(deserialize);
    }
}
