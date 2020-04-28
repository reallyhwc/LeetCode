package com.xuhu.LeetCode.mid.midBefore200.mid0102;


import com.xuhu.LeetCode.a.util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> listAll = new ArrayList<>();
        if(root == null) return listAll;
        List<TreeNode> list = new ArrayList<>();
        list.add(root);
        int index = 0;
        int lastSize = 1;
        while (lastSize != 0){

            int num = 0;
            List<Integer> tempList = new ArrayList<>();
            for(int i = 0; i < lastSize; i++){
                TreeNode node = list.get(index++);
                tempList.add(node.val);
                if(null != node.left){
                    list.add(node.left);
                    num++;
                }
                if(null != node.right){
                    list.add(node.right);
                    num++;
                }
            }
            lastSize = num;
            listAll.add(tempList);
        }
        return listAll;
    }
}