package com.algorithm.askar.tree;

import java.util.ArrayDeque;
import java.util.Deque;

public class SizeOfTree {

    public int sizeIterative(TreeNode root) {
        int c = 0;
        Deque<TreeNode> q = new ArrayDeque<>();
        if (root != null) {
            q.add(root);
            c++;
        }
        while (!q.isEmpty()) {
            TreeNode node = q.pop();
            if (node.left != null) {
                q.add(node.left);
                c++;
            }

            if (node.right != null) {
                q.add(node.right);
                c++;
            }
        }
        return c;
    }

    public int size(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return (size(root.left) + 1 + size(root.right));
        }
    }
}
