package com.xuhu.LeetCode.easy.easyBefore700.easy687;


import com.xuhu.LeetCode.a.util.TreeNode;

import java.lang.reflect.Member;
import java.lang.reflect.Method;

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
    int max = 0;

    public int longestUnivaluePath(TreeNode root) {
        max = 0;
        arrowLength(root);
        return max;
    }

    public int arrowLength(TreeNode node){
        if(node == null) return 0;
        int left = arrowLength(node.left);
        int right = arrowLength(node.right);
        int arrowLeft = 0;
        int arrowRight = 0;
        if(node.left != null && node.left.val == node.val){
            arrowLeft = left + 1;
        }
        if(node.right != null && node.right.val == node.val){
            arrowRight = right + 1;
        }
        max = Math.max(max,arrowLeft + arrowRight);
        return Math.max(arrowLeft,arrowRight);
    }

    public int longestUnivaluePath_byHand(TreeNode root) {
        if(root == null) return 0;
        int count = 0;
        int val = root.val;

        if(root.left != null ){
            if(root.left.val == val){
                count += (method(root.left) + 1);
                max = Math.max(max,count);
            }
            longestUnivaluePath_byHand(root.left);
        }
        if(root.right != null){
            if(root.right.val == val){
                count += (method(root.right) + 1);
                max = Math.max(max,count);
            }
            longestUnivaluePath_byHand(root.right);
        }
        return max;
    }

    //不拐弯，单边长度向下延伸的最大值(边的条数，并不是结点的个数)
    private int method(TreeNode root){
        if(root == null) return 0;
        int count = 0;
        int val = root.val;
        if(root.left != null ){
            if(root.left.val == val){
                count = Math.max(count,method(root.left) + 1);
            }else {
                longestUnivaluePath_byHand(root.left);
            }
        }
        if(root.right != null){
            if(root.right.val == val){
                count = Math.max(count,method(root.right) + 1);
            }else {
                longestUnivaluePath_byHand(root.right);
            }
        }
        return  count;
    }
}