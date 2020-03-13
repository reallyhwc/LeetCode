package com.xuhu.LeetCode.easy.easyBefore700.easy671;


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
    public int findSecondMinimumValue(TreeNode root) {
        return method(root,root.val);
    }

    private int method(TreeNode root, int val){
        if(root == null){
            return -1;
        }
        if(root.val > val){
            return root.val;
        }
        int l = method(root.left,val);
        int r = method(root.right,val);

        if(l > val && r > val){
            return Math.min(l,r);
        }
        return Math.max(l,r);
    }
}