package com.xuhu.LeetCode.easy.easyBefore600.easy0572;


import com.xuhu.LeetCode.a.util.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 *
 * 判断 t 是不是s 的子树，那么判断s是否与t相等 或者t是否是s.left 或s.right的子树
 */
class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s == null && t == null) return true;
        if(s == null || t == null) return false;
        return isSameTree(s,t) || isSubtree(s.left,t) || isSubtree(s.right,t);
    }

    public boolean isSameTree(TreeNode s, TreeNode t){
        if(s == null && t == null) return true;
        if(s == null || t == null) return false;
        if(s.val == t.val){
            return isSameTree(s.left,t.left) && isSameTree(s.right,t.right);
        }
        return false;
    }
}