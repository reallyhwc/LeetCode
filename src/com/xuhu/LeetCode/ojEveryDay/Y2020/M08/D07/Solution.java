package com.xuhu.LeetCode.ojEveryDay.Y2020.M08.D07;


import com.xuhu.LeetCode.a.util.TreeNode;

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null){
            return false;
        }
        if (p.val != q.val){
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right, q.right);
    }
}