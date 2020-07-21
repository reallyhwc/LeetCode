package com.xuhu.LeetCode.mid.midBefore400.mid0304;

public class Main {
    public static void main(String[] args){
        int[][] array = new int[][]{{3, 0, 1, 4, 2},
                                    {5, 6, 3, 2, 1},
                                    {1, 2, 0, 1, 5},
                                    {4, 1, 0, 1, 7},
                                    {1, 0, 3, 0, 5}};
        NumMatrix numMatrix = new NumMatrix(array);
        System.out.println(numMatrix.sumRegion(2, 1, 4, 3));
        System.out.println(numMatrix.sumRegion(1, 1, 2, 2));
        System.out.println(numMatrix.sumRegion(1, 2, 2, 4));
    }
}