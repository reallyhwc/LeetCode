package com.xuhu.LeetCode.easy.easyBefore600.easy0530;

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
    public int getMinimumDifference(TreeNode root) {
        getMin(root);
        return min;
    }

    private void getMin(TreeNode root){
        if(root == null){
            return ;
        }
        getMin(root.left);

        if(pre != null){
            min = Math.min(min,Math.abs(root.val - pre.val));
        }
        pre = root;
        getMin(root.right);
    }
}