package com.xuhu.LeetCode.mid.midBefore100.mid0063;


class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int x = obstacleGrid.length;
        int y = obstacleGrid[0].length;
        int[][] ans = new int[x][y];
        if(obstacleGrid[0][0] == 1) return 0;

        for(int i = x-1; i >= 0; i--){
            for(int j = y-1; j >= 0; j--){
                if(obstacleGrid[i][j] == 1){
                    ans[i][j] = 0;
                    continue;
                }

                if(i == x-1 && j == y-1){
                    ans[i][j] = 1;
                    continue;
                }

                if(i == x-1){
                    ans[i][j] = ans[i][j+1];
                    continue;
                }

                if(j == y-1){
                    ans[i][j] = ans[i+1][j];
                    continue;
                }

                ans[i][j] = ans[i+1][j] + ans[i][j+1];
            }
        }
        return ans[0][0];
    }
}