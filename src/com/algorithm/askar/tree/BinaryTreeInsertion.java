package com.algorithm.askar.tree;

public class BinaryTreeInsertion {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode node = new TreeNode(val);
        if (root == null) {
            return node;
        }

        TreeNode curr = root;
        TreeNode prev = root;
        while (curr != null) {
            prev = curr;
            if (curr.val > val) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }

        if (prev.val > val) {
            prev.left = node;
        } else {
            prev.right = node;
        }


        return root;
    }

    public TreeNode insertIntoRecursive(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (root.val > val) {
            root.left = insertIntoRecursive(root.left, val);
        } else {
            root.right = insertIntoRecursive(root.right, val);
        }
        return root;
    }
}
