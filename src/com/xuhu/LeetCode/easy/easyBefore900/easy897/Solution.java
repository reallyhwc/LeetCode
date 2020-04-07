package com.xuhu.LeetCode.easy.easyBefore900.easy897;

import com.xuhu.LeetCode.a.util.TreeNode;
import com.xuhu.LeetCode.a.util.TreeOperation;

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
    private TreeNode ans = null;
    public TreeNode increasingBST(TreeNode root) {
        method(root);
        return ans;
    }

    public void method(TreeNode node){
        if(node == null) return;
        method(node.right);
        TreeNode temp = new TreeNode(node.val);
        temp.left = null;
        temp.right = ans;
        ans = temp;
        method(node.left);
    }
}