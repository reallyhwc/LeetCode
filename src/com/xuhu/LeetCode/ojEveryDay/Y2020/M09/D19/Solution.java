package com.xuhu.LeetCode.ojEveryDay.Y2020.M09.D19;


import com.xuhu.LeetCode.a.util.TreeNode;

class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        int res = 0;
        if (root == null){
            return res;
        }
        if (root.left != null && root.left.left == null && root.left.right == null){
            res += root.left.val;
        }

        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right) + res;
    }
}