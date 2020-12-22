package com.xuhu.LeetCode.ojEveryDay.Y2020.M12.D22;


import com.xuhu.LeetCode.a.util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null){
            return new ArrayList<>();
        }
        List<List<Integer>> ansList = new ArrayList<> ();
        Stack<TreeNode> stack1 = new Stack<> ();
        Stack<TreeNode> stack2 = new Stack<> ();
        stack1.add(root);
        while (!stack1.isEmpty() || !stack2.isEmpty()){
            List<Integer> list = new ArrayList<> ();
            if (!stack1.isEmpty()){
                while (!stack1.isEmpty()){
                    TreeNode node = stack1.pop();
                    if (node.left != null){
                        stack2.push(node.left);
                    }
                    if (node.right != null){
                        stack2.push(node.right);
                    }
                    list.add(node.val);
                }
                ansList.add(list);
            }else {
                while (!stack2.isEmpty()){
                    TreeNode node = stack2.pop();
                    if (node.right != null){
                        stack1.push(node.right);
                    }
                    if (node.left != null){
                        stack1.push(node.left);
                    }
                    list.add(node.val);
                }
                ansList.add(list);
            }
        }
        return ansList;
    }
}