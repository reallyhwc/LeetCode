package com.xuhu.LeetCode.easy.easyBefore700.easy687;

import com.xuhu.LeetCode.a.util.CreateBinaryTreeByArray;
import com.xuhu.LeetCode.a.util.TreeNode;
import com.xuhu.LeetCode.a.util.TreeOperation;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        Integer[] array = {5,4,5,1,1,null,5};
        Integer[] array1 = {1,4,5,4,4,null,5};
        Integer[] array2 = {1,null,1,null,null,1,1,null,null,null,null,1,1,1};
        TreeNode node = CreateBinaryTreeByArray.createBinaryTreeByArray(array,0);
        TreeNode node1 = CreateBinaryTreeByArray.createBinaryTreeByArray(array1,0);
        TreeNode node2 = CreateBinaryTreeByArray.createBinaryTreeByArray(array2,0);
        TreeOperation.show(node);
        TreeOperation.show(node1);
        TreeOperation.show(node2);
        System.out.println(solution.longestUnivaluePath(node));
        System.out.println(solution.longestUnivaluePath(node1));
        System.out.println(solution.longestUnivaluePath(node2));
    }
}