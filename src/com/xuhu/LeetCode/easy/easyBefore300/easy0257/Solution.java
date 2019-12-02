package com.xuhu.LeetCode.easy.easyBefore300.easy0257;

import com.xuhu.LeetCode.a.util.ListNode;
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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if(root == null) return list;
        Method(root,"",list);
        return list;
    }

    public void Method(TreeNode node, String str, List<String> list){
        if(node == null){
            return;
        }
        str += node.val;
        if(node.left == null && node.right == null){
            list.add(str);
        }else {
            Method(node.left,str + "->",list);
            Method(node.right,str + "->",list);
        }
    }
}