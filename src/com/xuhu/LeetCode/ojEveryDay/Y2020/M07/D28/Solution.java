package com.xuhu.LeetCode.ojEveryDay.Y2020.M07.D28;


import com.xuhu.LeetCode.a.util.TreeNode;

class Solution {
    // 啥也不说，上来就是一梭子递归即可
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}