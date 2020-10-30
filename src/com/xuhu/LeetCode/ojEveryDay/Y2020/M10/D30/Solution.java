package com.xuhu.LeetCode.ojEveryDay.Y2020.M10.D30;


class Solution {
    int[][] operation = new int[][]{{0, 0, 1, -1}, {1, -1, 0, 0}};

    public int islandPerimeter(int[][] grid) {
        int totalNum = 0;
        int lessNum = 0;
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    totalNum++;
                    lessNum += calculateLessNum(i, j, grid, m, n);
                }
            }
        }

        return totalNum * 4 - lessNum;
    }

    private int calculateLessNum(int i, int j, int[][] grid, int m, int n) {
        if (grid[i][j] == 0) {
            return 0;
        }
        int ans = 0;
        if (j > 0 && grid[i][j - 1] == 1) {
            ans++;
        }
        if (j < n - 1 && grid[i][j + 1] == 1) {
            ans++;
        }
        if (i > 0 && grid[i - 1][j] == 1) {
            ans++;
        }
        if (i < m - 1 && grid[i + 1][j] == 1) {
            ans++;
        }
        return ans;
    }
}