package com.xuhu.LeetCode.mid.midBefore400.mid0304;

class NumMatrix {

    private int[][] sum = null;

    public NumMatrix(int[][] matrix) {
        // 这里通过动态规划的方法 实现一个前缀和数组
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }
        int M = matrix.length;
        int N = matrix[0].length;
        sum = new int[M+1][N+1];
        // sum [i+1][j+1] 表示矩阵中 0 0 到 i j 的矩阵中的所有值的和
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                sum[i+1][j+1] = sum[i+1][j] + sum[i][j+1] + matrix[i][j] - sum[i][j];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        // 通过一个数学性的方法实现计算即可
        return sum[row2+1][col2+1] + sum[row1][col1] - sum[row1][col2+1] - sum[row2+1][col1];
    }
}