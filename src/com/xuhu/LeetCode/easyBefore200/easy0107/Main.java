package com.xuhu.LeetCode.easyBefore200.easy0107;

import com.xuhu.LeetCode.a.util.CreateBinaryTreeByArray;

import java.util.List;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        Integer[] array = new Integer[]{3,9,20,null,null,15,7};
        List<List<Integer>> lists = solution.levelOrderBottom(CreateBinaryTreeByArray.createBinaryTreeByArray(array,0));
        for(List<Integer> X : lists){
            for(Integer I : X){
                System.out.print(I + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }
}