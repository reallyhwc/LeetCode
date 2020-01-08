package com.xuhu.LeetCode.easy.easyBefore500.easy0437;

import com.xuhu.LeetCode.a.util.CreateBinaryTreeByArray;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        Integer[] array = {10,5,-3,3,2,null,11,3,-2,null,1};
        System.out.println(solution.pathSum(CreateBinaryTreeByArray.createBinaryTreeByArray(array,0),8));
    }
}