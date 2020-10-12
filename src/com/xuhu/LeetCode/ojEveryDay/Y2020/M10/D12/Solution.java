package com.xuhu.LeetCode.ojEveryDay.Y2020.M10.D12;


import com.xuhu.LeetCode.a.util.TreeNode;

class Solution {

    int min = Integer.MAX_VALUE;
    TreeNode pre = null;

    public int getMinimumDifference(TreeNode root) {
        dfs(root);
        return min;
    }

    private void dfs(TreeNode node){
        if (node == null){
            return;
        }

        dfs(node.left);
        if (pre != null){
            min = Math.min(min,Math.abs(node.val - pre.val));
        }
        pre = node;
        dfs(node.right);
    }
}