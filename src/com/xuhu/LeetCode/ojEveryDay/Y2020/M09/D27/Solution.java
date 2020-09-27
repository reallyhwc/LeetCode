package com.xuhu.LeetCode.ojEveryDay.Y2020.M09.D27;


import com.xuhu.LeetCode.a.util.TreeNode;

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int pVal = p.val;
        int qVal = q.val;
        TreeNode node = root;
        while (node != null){
            int tempVal = node.val;
            if (pVal > tempVal && qVal > tempVal){
                node = node.right;
            }else if( pVal < tempVal && qVal < tempVal){
                node = node.left;
            }else{
                return node;
            }
        }
        return null;
    }
}