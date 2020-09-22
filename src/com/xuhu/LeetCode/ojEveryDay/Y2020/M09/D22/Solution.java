package com.xuhu.LeetCode.ojEveryDay.Y2020.M09.D22;


import com.xuhu.LeetCode.a.util.TreeNode;

class Solution {
    private int ans = 0;
    public int minCameraCover(TreeNode root) {
        if (root == null){
            return 0;
        }
        if (dfs(root) == 2){
            ans++;
        }
        return ans;
    }

    // 0 该节点安装了监视器 1 该节点可以观察但是没有安装监视器 2 该节点不可观察到
    private int dfs(TreeNode root) {
        if (root == null) {
            return 1;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);

        if(left == 2 || right == 2){
            ans++;
            return 0;
        }else if (left == 0 || right == 0) {
            return 1;
        }else {
            return 2;
        }
    }
}