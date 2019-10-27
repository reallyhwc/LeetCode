package com.xuhu.LeetCode.easy0107;

import com.xuhu.LeetCode.a.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> lists = new LinkedList<>();
        if(root == null){
            return lists;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            List<Integer> oneLevel = new ArrayList<>();
            int count = queue.size();
            for(int i = 0; i < count; i++){
                TreeNode temp = queue.poll();
                oneLevel.add(temp.val);
                if(temp.left != null){
                    queue.add(temp.left);
                }
                if(temp.right != null){
                    queue.add(temp.right);
                }
            }
            lists.addFirst(oneLevel);
        }
        return lists;
    }
}