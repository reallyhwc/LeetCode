package com.xuhu.LeetCode.easy.easyBefore600.easy0530;

import com.xuhu.LeetCode.a.util.CreateBinaryTreeByArray;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        Integer[] arrays = {1,null,3,null,null,2};
        Integer[] arrays1 = {1,null,2,null,null,2};
        System.out.println(solution.getMinimumDifference(CreateBinaryTreeByArray.createBinaryTreeByArray(arrays,0)));
        System.out.println(solution.getMinimumDifference(CreateBinaryTreeByArray.createBinaryTreeByArray(arrays1,0)));
    }
}