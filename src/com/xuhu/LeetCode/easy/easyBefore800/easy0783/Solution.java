package com.xuhu.LeetCode.easy.easyBefore800.easy0783;


import com.xuhu.LeetCode.a.util.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int min = Integer.MAX_VALUE;
    TreeNode pre = null;
    public int minDiffInBST(TreeNode root) {
        getMin(root);
        return min;
    }

    private void getMin(TreeNode node){
        if(node == null){
            return;
        }

        getMin(node.left);

        if(pre != null){
            min = Math.min(min,Math.abs(node.val - pre.val));
        }

        pre = node;

        getMin(node.right);
    }
}