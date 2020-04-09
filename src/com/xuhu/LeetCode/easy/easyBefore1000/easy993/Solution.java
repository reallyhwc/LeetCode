package com.xuhu.LeetCode.easy.easyBefore1000.easy993;


import com.xuhu.LeetCode.a.util.ListUtils;
import com.xuhu.LeetCode.a.util.TreeNode;

import java.util.*;

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
    Map<Integer,Integer> depth;
    Map<Integer, TreeNode> parent;
    public boolean isCousins(TreeNode root, int x, int y) {
        depth = new HashMap<>();
        parent = new HashMap<>();
        dfs(root, null);
        return (depth.get(x) == depth.get(y)) && parent.get(x) != parent.get(y);
    }

    public void dfs(TreeNode node,TreeNode pre){
        if(node != null){
            depth.put(node.val,pre != null ? 1 + depth.get(pre.val) : 0);
            parent.put(node.val,pre);
            dfs(node.left,node);
            dfs(node.right,node);
        }
    }
}