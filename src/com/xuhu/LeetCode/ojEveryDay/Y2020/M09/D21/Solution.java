package com.xuhu.LeetCode.ojEveryDay.Y2020.M09.D21;


import com.xuhu.LeetCode.a.util.TreeNode;

class Solution {
    int num = 0;
    public TreeNode convertBST(TreeNode root) {
        if(root == null){
            return root;
        }
        convertBST(root.right);
        root.val += num;
        num = root.val;
        convertBST(root.left);
        return root;
    }
}