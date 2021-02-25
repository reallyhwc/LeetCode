package com.xuhu.LeetCode.ojEveryDay.Y2021.M02.D25;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(Arrays.deepToString(solution.transpose(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})));
        System.out.println(Arrays.deepToString(solution.transpose(new int[][]{{1, 2, 3}, {4, 5, 6}})));
    }
}