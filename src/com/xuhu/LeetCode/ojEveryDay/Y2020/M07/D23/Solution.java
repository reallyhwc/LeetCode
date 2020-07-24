package com.xuhu.LeetCode.ojEveryDay.Y2020.M07.D23;


class Solution {
    // 又是一道比较经典的DP写法
    public int minPathSum(int[][] grid) {
        if (null == grid || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        // 执行原地算法   首先对于最后一行和最后一列进行边缘计算统计求和
        for (int i = m - 2; i >= 0; i--) {
            grid[i][n - 1] = grid[i][n - 1] + grid[i + 1][n - 1];
        }
        for (int i = n - 2; i >= 0; i--) {
            grid[m - 1][i] = grid[m - 1][i] + grid[m - 1][i + 1];
        }

        for (int i = m - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                // 求出从 i j 点开始到结尾的最短距离
                grid[i][j] = Math.min(grid[i + 1][j], grid[i][j + 1]) + grid[i][j];
            }
        }

        return grid[0][0];
    }
}