package com.xuhu.LeetCode.mid.midBefore200.mid0114;


import com.xuhu.LeetCode.a.util.TreeNode;

class Solution {
    public void flatten(TreeNode root) {
        if(null == root) return;
        TreeNode tempRight = root.right;
        TreeNode node = root;
        if(null != root.left){
            TreeNode temp = root.left;
            flatten(temp);
            root.right = temp;
            while (null != node.right){
                node = node.right;
            }
            root.left = null;
        }
        flatten(tempRight);
        node.right = tempRight;
    }
}