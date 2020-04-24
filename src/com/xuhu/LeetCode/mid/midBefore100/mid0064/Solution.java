package com.xuhu.LeetCode.mid.midBefore100.mid0064;


class Solution {
    public int minPathSum(int[][] grid) {
        int x = grid.length;
        int y = grid[0].length;
        for(int i = x-1; i >= 0; i--){
            for(int j = y-1; j >= 0; j--){
                if(i == x-1 && j == y-1){
                    continue;
                }

                if(i == x-1){
                    grid[i][j] += grid[i][j+1];
                    continue;
                }

                if(j == y-1){
                    grid[i][j] += grid[i+1][j];
                    continue;
                }

                grid[i][j] += Math.min(grid[i+1][j],grid[i][j+1]);
            }
        }
        return grid[0][0];
    }
}