package com.xuhu.LeetCode.easy.easyBefore900.easy867;


class Solution {
    public int[][] transpose(int[][] A) {
        int x = A.length;
        int y = A[0].length;
        int[][]ans = new int[y][x];

        for(int i =0; i < y; i++){
            for(int j = 0; j < x; j++){
                ans[i][j] = A[j][i];
            }
        }
        return ans;
    }
}