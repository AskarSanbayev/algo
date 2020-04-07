package com.algorithm.askar.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTraversal {
    List<Integer> integers = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return integers;
    }

    private void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        integers.add(root.val);
        inorder(root.right);
    }

    public List<Integer> inorderTraversalIterative(TreeNode root) {
        if (root == null) {
            return integers;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                curr = curr.left;
                stack.push(curr);
            }
            curr = stack.pop();
            integers.add(curr.val);
            curr = curr.right;
        }
        return integers;
    }
}
