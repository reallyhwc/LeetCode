package com.xuhu.LeetCode.mid.midBefore300.mid0240;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[][] array = {{1,   4,  7, 11, 15},
                         {2,   5,  8, 12, 19},
                         {3,   6,  9, 16, 22},
                         {10, 13, 14, 17, 24},
                         {18, 21, 23, 26, 30},};
        System.out.println(solution.searchMatrix(array,5));
        System.out.println(solution.searchMatrix(array,20));
    }
}