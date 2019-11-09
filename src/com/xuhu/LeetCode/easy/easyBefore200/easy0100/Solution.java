package com.xuhu.LeetCode.easy.easyBefore200.easy0100;

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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //运用递归的思想
        //两个都为空 true
        if(p == null && q == null){
            return true;
        }
        //只有一个为空 false
        if(p == null || q == null){
            return false;
        }
        return p.val == q.val ? (isSameTree(p.left,q.left) && isSameTree(p.right,q.right)) : false;
    }
}