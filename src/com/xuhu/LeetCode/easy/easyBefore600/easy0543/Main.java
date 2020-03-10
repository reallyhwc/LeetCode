package com.xuhu.LeetCode.easy.easyBefore600.easy0543;

import com.xuhu.LeetCode.a.util.CreateBinaryTreeByArray;
import com.xuhu.LeetCode.a.util.TreeOperation;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        Integer[] array = {1,2,3,4,5};
        Integer[] array1 = {2,3,null,1};
        System.out.println(solution.diameterOfBinaryTree(CreateBinaryTreeByArray.createBinaryTreeByArray(array,0)));
        System.out.println(solution.diameterOfBinaryTree(CreateBinaryTreeByArray.createBinaryTreeByArray(array1,0)));
        TreeOperation.show(CreateBinaryTreeByArray.createBinaryTreeByArray(array1,0));
//        System.out.println(solution.treeDepLength(CreateBinaryTreeByArray.createBinaryTreeByArray(array1,0)));
//        System.out.println(solution.diameterOfBinaryTree(CreateBinaryTreeByArray.createBinaryTreeByArray(array,0).left));
//        System.out.println(solution.diameterOfBinaryTree(CreateBinaryTreeByArray.createBinaryTreeByArray(array,0).right));
    }
}