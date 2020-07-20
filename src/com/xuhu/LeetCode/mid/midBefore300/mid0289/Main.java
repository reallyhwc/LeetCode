package com.xuhu.LeetCode.mid.midBefore300.mid0289;

import com.xuhu.LeetCode.a.util.ListUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[][] array = new int[][]{{0,1,0},
                                    {0,0,1},
                                    {1,1,1},
                                    {0,0,0}};
        ListUtils.pringlnDoubleArrays(array);
        solution.gameOfLife(array);
        System.out.println("-------------------------------");
        ListUtils.pringlnDoubleArrays(array);
    }
}