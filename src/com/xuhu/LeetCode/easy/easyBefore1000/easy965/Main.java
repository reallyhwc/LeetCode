package com.xuhu.LeetCode.easy.easyBefore1000.easy965;

import com.xuhu.LeetCode.a.util.CreateBinaryTreeByArray;
import com.xuhu.LeetCode.a.util.TreeNode;
import com.xuhu.LeetCode.a.util.TreeOperation;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        TreeNode node1 = CreateBinaryTreeByArray.createBinaryTreeByArray(new Integer[]{1,1,1,1,1,null,1},0);
        TreeNode node2 = CreateBinaryTreeByArray.createBinaryTreeByArray(new Integer[]{2,2,2,5,2},0);
        TreeOperation.show(node1);
        TreeOperation.show(node2);
        System.out.println(solution.isUnivalTree(node1));
        System.out.println(solution.isUnivalTree(node2));
    }
}