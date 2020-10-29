package com.xuhu.LeetCode.ojEveryDay.Y2020.M10.D29;


import com.xuhu.LeetCode.a.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    private int sum;
    public int sumNumbers(TreeNode root) {
        sum = 0;
        dfs(root,0);
        return sum;
    }

    private void dfs(TreeNode root, int val){
        if (root == null) {
            return;
        }
        int k = val * 10 + root.val;
        if (root.left == null && root.right == null){
            sum += k;
        }
        dfs(root.left,k);
        dfs(root.right, k);
    }

}