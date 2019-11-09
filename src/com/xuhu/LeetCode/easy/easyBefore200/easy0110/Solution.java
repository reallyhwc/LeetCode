package com.xuhu.LeetCode.easy.easyBefore200.easy0110;


import com.xuhu.LeetCode.a.util.TreeNode;

class Solution {
    public boolean isBalanced(TreeNode root) {
        return depth(root) != -1;
    }

    //递归过程中，一旦有-1出现，直接循环跳出，返回-1（也就是不平衡的时候）
    public int depth(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = depth(root.left);
        if(left == -1){
            return -1;
        }
        int right = depth(root.right);
        if(right == -1){
            return -1;
        }
        return Math.abs(left - right) < 2 ? Math.max(left,right) + 1 : -1;
    }
}