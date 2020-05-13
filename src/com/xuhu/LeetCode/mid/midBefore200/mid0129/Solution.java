package com.xuhu.LeetCode.mid.midBefore200.mid0129;


import com.xuhu.LeetCode.a.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int sumNumbers(TreeNode root) {
        if(root == null)return 0;
        return method(0,root);
    }

    private int method(int total, TreeNode root){
        int result = 0;
        int current = total * 10 + root.val;
        if(root.left != null){
            result += method(current,root.left);
        }
        if(root.right != null){
            result += method(current,root.right);
        }
        if(root.left == null && root.right == null){
            return current;
        }
        return result;
    }
//    Integer sum;
//    public int sumNumbers(TreeNode root) {
//        sum = 0;
//        method(root,new ArrayList<>());
//        return sum;
//    }
//
//    private void method(TreeNode root, List<Integer> list){
//        if(root == null) return;
//        int val = root.val;
//        list.add(val);
//
//        if(root.left == null && root.right == null){
//            sum += sumMethod(list);
//            list.remove(list.size()-1);
//            return;
//        }
//
//        if(root.left != null){
//            method(root.left,list);
//        }
//        if(root.right != null){
//            method(root.right,list);
//        }
//
//        list.remove(list.size()-1);
//        return;
//    }
//
//    private int sumMethod(List<Integer> list){
//        int total = 0;
//        for(Integer num : list){
//            total *= 10;
//            total += num;
//        }
//        return total;
//    }
}