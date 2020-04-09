package com.xuhu.LeetCode.easy.easyBefore1000.easy993;

import com.xuhu.LeetCode.a.util.CreateBinaryTreeByArray;
import com.xuhu.LeetCode.a.util.TreeNode;
import com.xuhu.LeetCode.a.util.TreeOperation;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        TreeNode node = CreateBinaryTreeByArray.createBinaryTreeByArray(new Integer[]{1,2,3,4},0);
        TreeNode node1 = CreateBinaryTreeByArray.createBinaryTreeByArray(new Integer[]{1,2,3,null,4,null,5},0);
        TreeNode node2 = CreateBinaryTreeByArray.createBinaryTreeByArray(new Integer[]{1,2,3,null,4},0);
        TreeOperation.show(node);
        TreeOperation.show(node1);
        TreeOperation.show(node2);
        System.out.println(solution.isCousins(node,4,3));
        System.out.println(solution.isCousins(node1,5,4));
        System.out.println(solution.isCousins(node2,2,3));
    }
}