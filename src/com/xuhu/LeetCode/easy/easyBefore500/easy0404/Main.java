package com.xuhu.LeetCode.easy.easyBefore500.easy0404;

import com.xuhu.LeetCode.a.util.CreateBinaryTreeByArray;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        Integer[] arrays = {3,9,20,null,null,15,7};
        System.out.println(solution.sumOfLeftLeaves(CreateBinaryTreeByArray.createBinaryTreeByArray(arrays,0)));
    }
}