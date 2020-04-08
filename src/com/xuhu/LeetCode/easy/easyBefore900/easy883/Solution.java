package com.xuhu.LeetCode.easy.easyBefore900.easy883;


class Solution {
    public int projectionArea(int[][] grid) {
        int xSum = 0;
        int ySum = 0;
        int zSum = 0;
        int N = grid.length;
        for(int i = 0; i < N; i++){
            int max = grid[i][0];
            for (int j = 0; j < N; j++){
                if(grid[i][j] > 0){
                    zSum++;
                }
                max = Math.max(max,grid[i][j]);
            }
            ySum += max;
        }

        for(int j = 0; j < N; j++){
            int max = grid[0][j];
            for(int i = 0; i < N; i++){
                max = Math.max(max,grid[i][j]);
            }
            xSum += max;
        }

        return xSum+ySum+zSum;
    }
}