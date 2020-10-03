package com.xuhu.LeetCode.ojEveryDay.Y2020.M09.D29;


import com.xuhu.LeetCode.a.util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode> ();
        List<Integer> list = new ArrayList<Integer>();
        if (root == null){
            return list;
        }

        stack.push(root);
        TreeNode pre = null;
        while (!stack.isEmpty()){

        }

        return list;
    }
}