package com.xuhu.LeetCode.mid.midBefore100.mid0073;

import com.xuhu.LeetCode.a.util.ListUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[][] array = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        ListUtils.pringlnDoubleArrays(array);
        System.out.println("_________________________________\n");
        solution.setZeroes(array);
        ListUtils.pringlnDoubleArrays(array);
    }
}