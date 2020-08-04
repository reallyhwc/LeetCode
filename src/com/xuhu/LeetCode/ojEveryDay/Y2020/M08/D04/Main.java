package com.xuhu.LeetCode.ojEveryDay.Y2020.M08.D04;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.canFinish(2, new int[][]{{0, 1}}));
        System.out.println(solution.canFinish(2, new int[][]{{1, 0}}));
        System.out.println(solution.canFinish(2, new int[][]{{1, 0}, {0, 1}}));
    }
}