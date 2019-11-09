package com.xuhu.LeetCode.easy.easyBefore200.easy0100;

import com.xuhu.LeetCode.a.util.CreateBinaryTreeByArray;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.isSameTree(CreateBinaryTreeByArray.createBinaryTreeByArray(new Integer[]{1,2,3},0),CreateBinaryTreeByArray.createBinaryTreeByArray(new Integer[]{1,2,3},0)));
    }
}