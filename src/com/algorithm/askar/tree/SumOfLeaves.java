package com.algorithm.askar.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SumOfLeaves {
    public int sumOfLeftLeavesBFS(TreeNode root) {
        if (root == null || root.left == null && root.right == null) return 0;

        int res = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();

            if (curr.left != null && curr.left.left == null && curr.left.right == null) res += curr.left.val;
            if (curr.left != null) queue.offer(curr.left);
            if (curr.right != null) queue.offer(curr.right);
        }
        return res;
    }

    public int sumOfLeftLeavesDFS(TreeNode root) {
        return helper(root, false);
    }

    private int helper(TreeNode root, boolean isLeft) {
        if (root == null) return 0;
        if (root.left == null && root.right == null && isLeft) {
            return root.val;
        }
        return helper(root.left, true) + helper(root.right, false);
    }

    public int sumOfLeftLeavesDFSIterative(TreeNode root) {
        Stack<TreeNode> s = new Stack<>();
        int sum = 0;
        TreeNode prev = root;
        if (root != null) {
            s.push(root);
        }
        while (!s.isEmpty()) {
            prev = root;
            root = s.pop();

            if (prev.left == root && root.left == null && root.right == null) {
                sum += root.val;
            }

            if (root.right != null) {
                s.push(root.right);
            }

            if (root.left != null) {
                s.push(root.left);
            }
        }
        return sum;
    }
}
