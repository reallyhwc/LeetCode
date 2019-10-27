package com.xuhu.LeetCode.easy0104;


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
    public int maxDepth(TreeNode root) {
        //如果root是null，那么深度为0
        //如果不是null，那么就是左子树，右子树的最大值加一
        if(root == null){
            return 0;
        }else {
            return Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;
        }
    }
}