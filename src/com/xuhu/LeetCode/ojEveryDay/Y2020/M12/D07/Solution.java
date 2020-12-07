package com.xuhu.LeetCode.ojEveryDay.Y2020.M12.D07;


class Solution {
    /**
     * 参照LC官方题解，首先通过选定行翻转，使得所有数组的第一位都是1
     * 这里并不实际使用翻转数组的做法 而是采用权值的计算方法
     * @param A
     * @return
     */
    public int matrixScore(int[][] A) {
        int m = A.length;
        int n = A[0].length;
        // 首先，根据贪心的思想，第一位肯定是1 直接在返回值上加上相应的权重
        int res = m * (1 << (n - 1));

        for (int j = 1; j < n; j++) {
            // 一列一列的遍历 看0的个数多还是1的个数多
            int nNums = 0;
            for (int i = 0; i < m; i++) {
                if (A[i][0] == 1) {
                    nNums += A[i][j];
                } else {
                    nNums += (1 - A[i][j]);
                }
            }
            nNums = Math.max(nNums, m - nNums);
            // 然后加上相应的权重
            res += (nNums * (1 << (n - j - 1)));
        }
        return res;
    }
}