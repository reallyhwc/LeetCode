package com.xuhu.LeetCode.easy.easyBefore500.easy0404;


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
    public int sumOfLeftLeaves(TreeNode root) {
        int res = 0;
        if(root == null){
            return res;
        }
        if(root.left != null && root.left.left == null && root.left.right == null){
            res += root.left.val;
        }
        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right) + res;
    }
}