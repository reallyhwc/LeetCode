package com.xuhu.LeetCode.easy.easyBefore900.easy872;


import com.xuhu.LeetCode.a.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        return isSameList(method(root1,new ArrayList<>()),method(root2,new ArrayList<>()));
    }

    public List<Integer> method(TreeNode node, List<Integer> list){
        if(node == null) return list;
        if(null == node.left && null == node.right){
            list.add(node.val);
            return list;
        }
        method(node.left,list);
        method(node.right,list);
        return list;
    }

    public boolean isSameList(List<Integer> list1, List<Integer>list2){
        if(list1.size() != list2.size()){
            return false;
        }
        for(int i = 0; i < list1.size(); i++){
            if(list1.get(i) != list2.get(i)){
                return false;
            }
        }
        return true;
    }
}