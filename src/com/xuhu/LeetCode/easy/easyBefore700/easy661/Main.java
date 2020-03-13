package com.xuhu.LeetCode.easy.easyBefore700.easy661;

import com.xuhu.LeetCode.a.util.ListUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[][] array = {{1,1,1},{1,0,1},{1,1,1}};
        int[][] array1 = {{1}};
        ListUtils.pringlnDoubleArrays(solution.imageSmoother(array));
        ListUtils.pringlnDoubleArrays(solution.imageSmoother(array1));
        System.out.println();
    }
}