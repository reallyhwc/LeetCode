package com.xuhu.LeetCode.ojEveryDay.Y2020.M07.D26;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestIncreasingPath(new int[][]{
                {9, 9, 4},
                {6, 6, 8},
                {2, 1, 1}}));
        System.out.println(solution.longestIncreasingPath(new int[][]{
                {3, 4, 5},
                {2, 4, 6},
                {1, 2, 1}}));
    }
}