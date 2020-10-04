package com.xuhu.LeetCode.game.week.W2020_10_04.T02;


import com.xuhu.LeetCode.a.util.TreeNode;

import java.util.*;

class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        if (root == null){
            return false;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int layers = 0;
        while (!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> list = new ArrayList<> ();
            for (int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null){
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            layers++;

            if (!validateList(list,layers % 2 == 1)){
                return false;
            }

        }
        return true;
    }

    private  boolean validateList(ArrayList<Integer> list, boolean isOddNums){
        if (null == list || list.size() == 0){
            return true;
        }
        int size = list.size();
        if (isOddNums){
            // 奇数层 要求递增
            if (list.get(0) % 2 != 1){
                return false;
            }
            for (int i = 1; i < size; i++) {
                if (list.get(i) % 2 != 1 || list.get(i) <= list.get(i-1)){
                    return false;
                }
            }
        }else {
            // 偶数层 要求递减
            if (list.get(0) % 2 != 0){
                return false;
            }
            for (int i = 1; i < size; i++) {
                if (list.get(i) % 2 != 0 || list.get(i) >= list.get(i-1)){
                    return false;
                }
            }
        }

        return true;
    }
}