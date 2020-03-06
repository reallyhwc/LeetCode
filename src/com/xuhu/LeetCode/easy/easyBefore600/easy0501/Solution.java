package com.xuhu.LeetCode.easy.easyBefore600.easy0501;


import com.sun.source.tree.Tree;
import com.xuhu.LeetCode.a.util.TreeNode;

import java.util.LinkedList;
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
    int maxTimes = 0;
    int thisTimes = 0;
    List<Integer> res = new LinkedList<>();
    TreeNode pre = null;
    public int[] findMode(TreeNode root) {
        method(root);
        int[] result = new int[res.size()];
        for(int i = 0; i < res.size(); i++){
            result[i] = res.get(i);
        }
        return result;
    }

    private void method(TreeNode root){
        if(root == null){
            return;
        }
        method(root.left);
        if(pre != null && pre.val == root.val){
            thisTimes++;
        }else{
            thisTimes = 1;
        }
        pre = root;
        if(thisTimes == maxTimes){
            res.add(root.val);
        }else if(thisTimes > maxTimes){
            maxTimes = thisTimes;
            res.clear();
            res.add(root.val);
        }
        method(root.right);
    }
}