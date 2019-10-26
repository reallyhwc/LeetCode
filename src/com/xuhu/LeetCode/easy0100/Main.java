package com.xuhu.LeetCode.easy0100;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(2);
        TreeNode node6 = new TreeNode(3);
        node1.left = node2;
        node1.right = node3;
        node4.left = node5;
        node4.right = node6;
        System.out.println(solution.isSameTree(node1,node4));
    }
}