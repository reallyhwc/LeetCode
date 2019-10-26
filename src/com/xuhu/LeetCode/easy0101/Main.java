package com.xuhu.LeetCode.easy0101;

import com.xuhu.LeetCode.a.util.CreateBinaryTreeByArray;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        Integer[] array = new Integer[]{1,2,2,3,4,4,3};
        System.out.println(solution.isSymmetric(CreateBinaryTreeByArray.createBinaryTreeByArray(array,0)));
    }
}