package com.xuhu.LeetCode.easy.easyBefore900.easy840;


import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int ans = 0;
        int x = grid.length;
        int y = grid[0].length;
        Set<String> set = new HashSet<>();
        set.add("[8,1,6,3,5,7,4,9,2]");
        set.add("[6,1,8,7,5,3,2,9,4]");
        set.add("[4,9,2,3,5,7,8,1,6]");
        set.add("[2,9,4,7,5,3,6,1,8]");
        set.add("[6,7,2,1,5,9,8,3,4]");
        set.add("[8,3,4,1,5,9,6,7,2]");
        set.add("[2,7,6,9,5,1,4,3,8]");
        set.add("[4,3,8,9,5,1,2,7,6]");
        for(int i = 1; i < x-1; i++){
            for(int j = 1; j < y-1; j++){
                if(grid[i][j] == 5 && set.contains(toString(grid,i,j))){
                    ans++;
                }
            }
        }
        return ans;
    }

    private String toString(int[][] grid, int i, int j){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        stringBuffer.append(grid[i-1][j-1]);
        stringBuffer.append(",");
        stringBuffer.append(grid[i-1][j]);
        stringBuffer.append(",");
        stringBuffer.append(grid[i-1][j+1]);
        stringBuffer.append(",");
        stringBuffer.append(grid[i][j-1]);
        stringBuffer.append(",");
        stringBuffer.append(grid[i][j]);
        stringBuffer.append(",");
        stringBuffer.append(grid[i][j+1]);
        stringBuffer.append(",");
        stringBuffer.append(grid[i+1][j-1]);
        stringBuffer.append(",");
        stringBuffer.append(grid[i+1][j]);
        stringBuffer.append(",");
        stringBuffer.append(grid[i+1][j+1]);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}