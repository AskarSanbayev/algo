package com.algorithm.askar.tree;

public class IsSameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null){
            return true;
        }
        if ((p == null || q == null ) ||p.val != q.val){
            return false;
        }
        boolean left = isSameTree(p.left,q.left);
        if (!left) return false;

        return isSameTree(p.right,q.right);
    }
}
