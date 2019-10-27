package com.xuhu.LeetCode.easy0104;

import com.xuhu.LeetCode.a.util.CreateBinaryTreeByArray;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        Integer[] array = new Integer[]{3,9,20,null,null,15,7};
        System.out.println(solution.maxDepth(CreateBinaryTreeByArray.createBinaryTreeByArray(array,0)));
    }
}