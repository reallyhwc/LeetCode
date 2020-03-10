package com.xuhu.LeetCode.easy.easyBefore600.easy0563;


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
    public int findTilt(TreeNode root) {
        method(root);
        return ans;
    }

    private int method(TreeNode root){
        if(root == null){
            return 0;
        }
        int L = method(root.left);
        int R = method(root.right);
        int rootNum = (L + R + root.val);
        root.val = rootNum;

        ans += Math.abs(L - R);
        return rootNum;
    }
}