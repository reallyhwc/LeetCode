package com.xuhu.LeetCode.game.week.W2020_09_20.T03;


class Solution {
    int m;
    int n;

    /**
     * 一个比较经典的DP 哎，只能说还是自己不够熟练
     * @param grid
     * @return
     */
    public int maxProductPath(int[][] grid) {

        long mod = (long)1e9+7;
        m = grid.length;
        n = grid[0].length;
        // dp0 表示走到当前下标的最大积
        long[][] dp0 = new long[m][n];
        // dp1 表示走到当前下标的最小积
        long[][] dp1 = new long[m][n];
        dp0[m - 1][n - 1] = grid[m - 1][n - 1];
        dp1[m - 1][n - 1] = grid[m - 1][n - 1];
        // 初始化数据
        for (int i = n - 2; i >= 0; i--) {
            dp0[m - 1][i] = dp0[m - 1][i + 1] * grid[m - 1][i];
            dp1[m - 1][i] = dp1[m - 1][i + 1] * grid[m - 1][i];
        }
        // 初始化数据
        for (int i = m - 2; i >= 0; i--) {
            dp0[i][n - 1] = dp0[i + 1][n - 1] * grid[i][n - 1];
            dp1[i][n - 1] = dp0[i + 1][n - 1] * grid[i][n - 1];
        }

        for (int i = m - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                long a = ((dp0[i + 1][j]) * grid[i][j]);
                long b = ((dp0[i][j + 1]) * grid[i][j]);
                long c = ((dp1[i + 1][j]) * grid[i][j]);
                long d = ((dp1[i][j + 1]) * grid[i][j]);
                dp0[i][j] = Math.max(Math.max(a,b),Math.max(c,d));
                dp1[i][j] = Math.min(Math.min(a,b),Math.min(c,d));
            }
        }

        long res1 = dp0[0][0] % mod;
        long res2 = dp1[0][0] % mod;

        long res = Math.max(res1,res2);

        return res < 0 ? -1 : (int) res;
    }
}