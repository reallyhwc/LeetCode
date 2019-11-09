package com.xuhu.LeetCode.easyBefore200.easy0110;

import com.xuhu.LeetCode.a.util.CreateBinaryTreeByArray;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        Integer[] array1 = {3,9,20,null,null,15,7};
        Integer[] array2 = {1,2,2,3,3,null,null,4,4};
        System.out.println(solution.isBalanced(CreateBinaryTreeByArray.createBinaryTreeByArray(array1,0)));
        System.out.println(solution.isBalanced(CreateBinaryTreeByArray.createBinaryTreeByArray(array2,0)));
    }
}