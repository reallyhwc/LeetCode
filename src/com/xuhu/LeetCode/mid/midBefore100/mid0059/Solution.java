package com.xuhu.LeetCode.mid.midBefore100.mid0059;


class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];

        int c = 1;
        int j = 0;
        while (c <= n * n){

            for(int i = j; i < n - j; i++)      ans[j][i] = c++;
            for(int i = j + 1; i < n - j; i++)  ans[i][n-j-1] = c++;
            for(int i = n - j - 2; i >= j; i--) ans[n-j-1][i] = c++;
            for(int i = n - j - 2; i > j; i--)  ans[i][j] = c++;

            j++;
        }
        return ans;
    }
}