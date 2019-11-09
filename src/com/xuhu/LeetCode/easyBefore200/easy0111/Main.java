package com.xuhu.LeetCode.easyBefore200.easy0111;

import com.xuhu.LeetCode.a.util.CreateBinaryTreeByArray;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        Integer[] array = {3,9,20,null,null,15,7};
        Integer[] array1 = {1,2};
        System.out.println(solution.minDepth(CreateBinaryTreeByArray.createBinaryTreeByArray(array,0)));
    }
}