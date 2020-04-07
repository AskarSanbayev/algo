package com.algorithm.askar.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraverseBottom {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> list = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if (root != null) {
            q.add(root);
        }
        while (!q.isEmpty()) {
            List<Integer> levelList = new ArrayList<>();
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode temp = q.poll();
                levelList.add(temp.val);
                if (temp.left != null) {
                    q.add(temp.left);
                }

                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
            list.addFirst(levelList);
        }
        return list;
    }
}
