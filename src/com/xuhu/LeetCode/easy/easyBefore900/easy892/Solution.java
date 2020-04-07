package com.xuhu.LeetCode.easy.easyBefore900.easy892;


class Solution {
    public int surfaceArea(int[][] grid) {
        int N = grid.length;
        int area = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                int level = grid[i][j];
                if(level > 0){
                    // 一个柱体中：2个底面 + 所有的正方体都贡献了4个侧表面积
                    area += (level << 2) + 2;
                    // 减掉 i 与 i-1 相贴的两份表面积
                    area -= i > 0 ? Math.min(level,grid[i-1][j]) << 1 : 0;
                    // 减掉 j 与 j-1 相贴的两份表面积
                    area -= j > 0 ? Math.min(level,grid[i][j-1]) << 1 : 0;
                }
            }
        }
        return area;
    }
}