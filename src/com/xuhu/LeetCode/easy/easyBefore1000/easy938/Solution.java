package com.xuhu.LeetCode.easy.easyBefore1000.easy938;


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
    private int ans;
    public int rangeSumBST(TreeNode root, int L, int R) {
        ans = 0;
        method(root,L,R);
        return ans;
    }

    private void method(TreeNode root, int L, int R){
        if(root == null) return ;
        method(root.left,L,R);
        if(root.val >= L && root.val <= R){
            ans += root.val;
        }
        method(root.right,L,R);
    }


    public int rangeSumBST1(TreeNode root, int L, int R) {
        if(root == null) return 0;
        if(root.val > R){
            return rangeSumBST1(root.left,L,R);
        }else if(root.val < L){
            return rangeSumBST1(root.right,L,R);
        }else {
            return root.val + rangeSumBST1(root.left,L,R) + rangeSumBST1(root.right,L,R);
        }

    }
}