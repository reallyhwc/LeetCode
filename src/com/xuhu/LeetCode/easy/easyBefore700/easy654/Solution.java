package com.xuhu.LeetCode.easy.easyBefore700.easy654;


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
    List<Integer> list = null;
    public boolean findTarget(TreeNode root, int k) {
        list = new ArrayList<>();
        readTree(root);
        int i = 0;
        int j = list.size()-1;
        while (i < j){
            int sum = list.get(i) + list.get(j);
            if(sum < k){
                i++;
            }else if(sum > k){
                j--;
            }else {
                return true;
            }
        }
        return false;
    }

    private void readTree(TreeNode root){
        if(root == null){
            return ;
        }
        readTree(root.left);
        list.add(root.val);
        readTree(root.right);
    }
}