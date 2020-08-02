package com.xuhu.LeetCode.ojEveryDay.Y2020.M08.D02;


import com.xuhu.LeetCode.a.util.TreeNode;

class Solution {
    /**
     * 稍微带了一点条件的递归
     *
     * @param root
     */
    public void flatten(TreeNode root) {
        if (root == null){
            return;
        }
        TreeNode tempLeft = root.left;
        TreeNode tempRight = root.right;
        flatten(tempLeft);
        flatten(tempRight);
        TreeNode temp = root;
        temp.left = null;
        temp.right = tempLeft;
        while (temp.right != null){
            temp = temp.right;
        }
        temp.right = tempRight;
    }
}