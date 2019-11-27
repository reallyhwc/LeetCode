package com.xuhu.LeetCode.easy.easyBefore300.easy0235;

import com.xuhu.LeetCode.a.util.TreeNode;

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int pVal = p.val;
        int qVal = q.val;
        TreeNode node = root;

        //利用一下平衡二叉树的属性
        //如果要查找的两个值，都比当前node的大，那么这两个点肯定在node的左边
        //同理
        //如果还有不理解的地方，建议温习这道LeetCode的题解
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