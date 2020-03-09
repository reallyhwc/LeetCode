package com.xuhu.LeetCode.easy.easyBefore600.easy0538;


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
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        calculation(root);
        return root;
    }

    //逆中序遍历
    private void calculation(TreeNode root){
        if(root == null){
            return;
        }
        calculation(root.right);
        int temp = root.val;
        root.val += sum;
        sum += temp;
        calculation(root.left);
    }
}