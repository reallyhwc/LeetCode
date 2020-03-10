package com.xuhu.LeetCode.easy.easyBefore600.easy0543;

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
    int ans = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return ans;
    }

    private int depth(TreeNode root){
        if(root == null){
            return 0;
        }
        int L = depth(root.left);
        int R = depth(root.right);
        ans = Math.max(L + R, ans);
        return Math.max(L, R) + 1;
    }

}