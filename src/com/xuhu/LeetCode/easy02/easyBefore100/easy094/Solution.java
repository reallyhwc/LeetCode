package com.xuhu.LeetCode.easy02.easyBefore100.easy094;


import com.xuhu.LeetCode.a.util.TreeNode;

import java.util.List;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new java.util.ArrayList<>();
        inorderTraversal(root, list);
        return list;
    }

    private void inorderTraversal(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }

        inorderTraversal(root.left, list);
        list.add(root.val);
        inorderTraversal(root.right, list);
    }
}