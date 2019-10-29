package com.xuhu.LeetCode.easy0112;

import com.xuhu.LeetCode.a.util.CreateBinaryTreeByArray;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        //最大树
        Integer[] array = {5,4,8,11,null,13,4,7,2,null,null,null,1};
        //左子树
        Integer[] array1 = {4,11,null,7,2};
        //右子树
        Integer[] array2 = {8,13,4,null,null,null,1};
        System.out.println(solution.hasPathSum(CreateBinaryTreeByArray.createBinaryTreeByArray(array,0),27));
        System.out.println(solution.hasPathSum(CreateBinaryTreeByArray.createBinaryTreeByArray(array1,0),22));
        System.out.println(solution.hasPathSum(CreateBinaryTreeByArray.createBinaryTreeByArray(array2,0),13));
    }
}