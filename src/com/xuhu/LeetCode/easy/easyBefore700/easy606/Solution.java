package com.xuhu.LeetCode.easy.easyBefore700.easy606;


import com.xuhu.LeetCode.a.util.TreeNode;

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
    public String tree2str(TreeNode t) {
        if(t == null){
            return new String();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(t.val);
        if(t.left != null){
            stringBuilder.append('(');
            stringBuilder.append(tree2str(t.left));
            stringBuilder.append(')');
            if(t.right != null){
                stringBuilder.append('(');
                stringBuilder.append(tree2str(t.right));
                stringBuilder.append(')');
            }
        }else {
            if(t.right != null){
                stringBuilder.append("()(");
                stringBuilder.append(tree2str(t.right));
                stringBuilder.append(')');
            }
        }
        return stringBuilder.toString();
    }
}