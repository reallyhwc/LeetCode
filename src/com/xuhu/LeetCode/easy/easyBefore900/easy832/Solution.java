package com.xuhu.LeetCode.easy.easyBefore900.easy832;


class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        if(A == null || A.length == 0 || A[0].length == 0){
            return null;
        }
        int x = A.length;
        int y = A[0].length;
        int[][] B = new int[x][y];
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                B[i][j] = 1 - A[i][y-j-1];
            }
        }
        return B;
    }
}