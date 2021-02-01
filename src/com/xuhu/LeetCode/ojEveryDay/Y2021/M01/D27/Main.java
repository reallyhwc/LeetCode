package com.xuhu.LeetCode.ojEveryDay.Y2021.M01.D27;


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] array = new int[][]{{3, 1, 2}, {3, 2, 3}, {1, 1, 3}, {1, 2, 4}, {1, 1, 2}, {2, 3, 4}};
        System.out.println(solution.maxNumEdgesToRemove(4, array));
    }
}