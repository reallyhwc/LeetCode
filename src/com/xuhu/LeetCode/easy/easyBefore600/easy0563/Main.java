package com.xuhu.LeetCode.easy.easyBefore600.easy0563;

import com.xuhu.LeetCode.a.util.CreateBinaryTreeByArray;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        Integer[] array = {1,2,3};
        System.out.println(solution.findTilt(CreateBinaryTreeByArray.createBinaryTreeByArray(array,0)));
    }
}