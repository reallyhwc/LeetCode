package com.xuhu.LeetCode.easy.easyBefore700.easy669;


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
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if(root == null){
            return null;
        }
        if(root.val >= L && root.val <= R){
            root.left = trimBST(root.left,L,R);
            root.right = trimBST(root.right,L,R);
            return root;
        }else {
            if(root.val < L){
                return trimBST(root.right,L,R);
            }else {
                return trimBST(root.left,L,R);
            }
        }
    }
}