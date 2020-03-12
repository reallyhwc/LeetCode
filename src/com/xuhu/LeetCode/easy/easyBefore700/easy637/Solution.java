package com.xuhu.LeetCode.easy.easyBefore700.easy637;


import com.xuhu.LeetCode.a.util.ListUtils;
import com.xuhu.LeetCode.a.util.TreeNode;

import javax.xml.crypto.dom.DOMCryptoContext;
import java.util.*;
import java.util.function.DoubleBinaryOperator;

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

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null) return list;
        queue.add(root);
        int len = queue.size();
        while (len != 0){
            long total = 0;
            int num = 0;
            for(int i = 0; i < len; i++){
                TreeNode node = queue.poll();
                total += node.val;
                num++;
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            double a = (double) total/num;
            list.add(a);
            len = queue.size();
        }
        return list;
    }



    public List<Double> averageOfLevels_stack(TreeNode root) {
        List<Double> list = new ArrayList<>();
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        if(root == null){
            return list;
        }
        stack1.push(root);
        while (!stack1.isEmpty() || !stack2.isEmpty()){
            if(stack1.isEmpty()){
                long total = 0;
                int num = 0;
                while (!stack2.isEmpty()){
                    TreeNode node = stack2.pop();
                    total += node.val;
                    num++;
                    if(node.left != null) stack1.push(node.left);
                    if(node.right != null) stack1.push(node.right);
                }
                double a = (double) total/num;
                list.add(a);
            }else {
                long total = 0;
                int num = 0;
                while (!stack1.isEmpty()){
                    TreeNode node = stack1.pop();
                    total += node.val;
                    num++;
                    if(node.left != null) stack2.push(node.left);
                    if(node.right != null) stack2.push(node.right);
                }
                double a = (double) total/num;
                list.add(a);
            }
        }
        return list;
    }
}