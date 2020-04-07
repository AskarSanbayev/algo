package com.algorithm.askar.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LargestValueInEachRow {
    public List<Integer> largestValuesBFS(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if (root != null) {
            q.add(root);
        }

        while (!q.isEmpty()) {
            int size = q.size();
            double MAX = -Double.MAX_VALUE;
            for (int i = 0; i < size; i++) {
                root = q.poll();
                MAX = Math.max(MAX, root.val);
                if (root.left != null) {
                    q.add(root.left);
                }

                if (root.right != null) {
                    q.add(root.right);
                }
            }
            list.add((int) MAX);
        }

        return list;
    }

    public List<Integer> largestValuesDFS(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        dfs(res, root, 0);
        return res;
    }

    private void dfs(List<Integer> res, TreeNode root, int row) {
        if (root == null) return;
        setMax(res, root, row);
        dfs(res, root.left, row + 1);
        dfs(res, root.right, row + 1);
    }

    private void setMax(List<Integer> res, TreeNode root, int row) {
        if (row >= res.size()) res.add(root.val);
        else res.set(row, Math.max(root.val, res.get(row)));
    }
}
