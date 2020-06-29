package com.xuhu.LeetCode.mid.midBefore200.mid0200;


class Solution {

    private static final int[][] direction = {{1, -1, 0, 0},{0, 0, 1, -1}};

    public int numIslands(char[][] grid) {
        if (null == grid || grid.length == 0){
            return 0;
        }
        int x = grid.length;
        int y = grid[0].length;

        int ans = 0;
        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                if (grid[i][j] == '1'){
                    ans++;
                    convertIsland(grid,i,j,x,y);
                }
            }
        }
        return ans;
    }

    private void convertIsland(char[][] grid, int i, int j, int x, int y){
        if (grid[i][j] == '0'){
            return;
        }
        grid[i][j] = '0';
        for (int t = 0; t < 4; t++){
            int nowI = i+direction[0][t];
            int nowJ = j+direction[1][t];
            if(isRightCoordinate(nowI, nowJ, x, y) && grid[nowI][nowJ] == '1'){
                convertIsland(grid, nowI, nowJ, x, y);
            }
        }
    }

    private boolean isRightCoordinate(int i, int j, int x, int y){
        return (i >= 0 && i < x && j >= 0 && j < y);
    }
}