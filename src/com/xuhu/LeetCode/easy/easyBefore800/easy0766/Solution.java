package com.xuhu.LeetCode.easy.easyBefore800.easy0766;


class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int high = matrix.length;
        int width = matrix[0].length;
        boolean ans = true;
        ans &= isThisRight(matrix,0,0,high,width,matrix[0][0]);
        for(int i = 1; i < high; i++){
            ans &= isThisRight(matrix,i,0,high,width,matrix[i][0]);
        }
        for(int j = 1; j < width; j++){
            ans &= isThisRight(matrix,0,j,high,width,matrix[0][j]);
        }
        return ans;
    }

    private boolean isThisRight(int[][] matrix, int i, int j, int high, int width, int target){
        while (i < high && j < width){
            if(matrix[i][j] != target){
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
}