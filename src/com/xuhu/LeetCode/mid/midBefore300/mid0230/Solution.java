package com.xuhu.LeetCode.mid.midBefore300.mid0230;


import com.xuhu.LeetCode.a.util.TreeNode;

class Solution {

    private int target = 0;

    public int kthSmallest(TreeNode root, int k) {
        target = k;
        return DFS(root);
    }

    // 传统做法 有效递归即可
    private int DFS(TreeNode root){
        if (root == null){
            return -1;
        }
        int num = -1;
        num = DFS(root.left);
        if (num != -1){
            return num;
        }
        if (target == 1){
            return root.val;
        }else {
            target--;
        }
        return DFS(root.right);
    }
}