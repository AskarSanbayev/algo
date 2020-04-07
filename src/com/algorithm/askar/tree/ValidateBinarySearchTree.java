package com.algorithm.askar.tree;

import java.util.Stack;

public class ValidateBinarySearchTree {

    public boolean isValidBSTIterative(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        double MAX = -Double.MAX_VALUE;
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (root.val <= MAX) return false;
            MAX = root.val;
            root = root.right;
        }
        return true;
    }

    public boolean helper(TreeNode node, Integer lower, Integer upper) {
        if (node == null) return true;

        int val = node.val;
        if (lower != null && val <= lower) return false;
        if (upper != null && val >= upper) return false;

        if (!helper(node.right, val, upper)) return false;
        if (!helper(node.left, lower, val)) return false;
        return true;
    }

    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }
}
