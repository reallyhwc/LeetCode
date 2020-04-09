package com.xuhu.LeetCode.easy.easyBefore1000.easy965;

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
    public boolean isUnivalTree(TreeNode root) {
        if(root == null) return true;
        boolean ans = true;
        if(root.left != null){
            if(root.left.val != root.val){
                return false;
            }else {
                ans &= isUnivalTree(root.left);
            }
        }
        if(root.right != null){
            if(root.right.val != root.val){
                return false;
            }else {
                ans &= isUnivalTree(root.right);
            }
        }
        return ans;
    }
}