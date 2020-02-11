package com.xuhu.LeetCode.easy.easyBefore500.easy0463;


class Solution {
    public int islandPerimeter(int[][] grid) {
        int result = 0;
        int width = grid.length;
        int heigth = grid[0].length;
        for(int i = 0; i < width; i++){
            for(int j = 0; j < heigth; j++){
                if(grid[i][j] == 1){
                    result += 4;
                    if((i + 1) < width && grid[i+1][j] == 1){
                        result -= 2;
                    }
                    if((j + 1) < heigth && grid[i][j+1] == 1){
                        result -= 2;
                    }
                }
            }
        }
        return result;
    }
}