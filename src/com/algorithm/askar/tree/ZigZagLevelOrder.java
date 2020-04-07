package com.algorithm.askar.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZagLevelOrder {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> deq = new LinkedList<>();
        deq.add(root);
        boolean direction = true;
        while (!deq.isEmpty()) {
            LinkedList<Integer> oneLevel = new LinkedList<>();
            int size = deq.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = deq.poll();
                if (direction) {
                    oneLevel.add(node.val);
                } else {
                    oneLevel.addFirst(node.val);
                }
                if (node.left != null) {
                    deq.add(node.left);
                }
                if (node.right != null) {
                    deq.add(node.right);
                }
            }
            result.add(oneLevel);
            direction = !direction;
        }
        return result;
    }
}
