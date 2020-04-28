package com.xuhu.LeetCode.mid.midBefore100.mid0098;


import com.xuhu.LeetCode.a.util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    TreeNode pre;
    //递归 超越100%
    public boolean isValidBST(TreeNode root) {
        pre = null;
        return method(root);
    }

    private boolean method(TreeNode root){
        if(root == null) return true;
        if(!method(root.left)){
            return false;
        }
        if(pre != null && pre.val >= root.val){
            return false;
        }else {
            pre = root;
        }
        if(!method(root.right)){
            return false;
        }
        return true;
    }

    // 非递归 太慢了，换递归
//    public boolean isValidBST(TreeNode root) {
//        if(root == null) return true;
//        TreeNode last = null;
//        //这里利用了一下非递归中序遍历二叉树
//        Stack<TreeNode> stack = new Stack<>();
//        while (root != null || !stack.isEmpty()){
//            while (root != null){
//                stack.push(root);
//                root = root.left;
//            }
//            root = stack.pop();
//            if(null != last && last.val >= root.val){
//                return false;
//            }else {
//                last = root;
//            }
//            root = root.right;
//        }
//        return true;
//    }
}