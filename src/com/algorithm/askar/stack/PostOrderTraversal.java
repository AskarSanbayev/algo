package com.algorithm.askar.stack;

import com.algorithm.askar.tree.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class PostOrderTraversal {

    public List<Integer> postOrderTraversal(TreeNode root) {
        LinkedList<Integer> list = new LinkedList<>();
        Stack<TreeNode> s1 = new Stack<>();

        if (root != null) {
            s1.push(root);
        }

        while (s1.isEmpty()) {
            TreeNode temp = s1.pop();
            list.addFirst(temp.val);

            if (temp.left != null) {
                s1.push(temp.left);
            }

            if (temp.right != null) {
                s1.push(temp.right);
            }
        }

        return list;
    }
}
