package com.xuhu.LeetCode.mid.midBefore100.mid0073;


class Solution {
    public void setZeroes(int[][] matrix) {
        int x = matrix.length;
        int y = matrix[0].length;
        boolean x_tag = false;
        boolean y_tag = false;
        for(int i = 0; i < x; i++){
            if(matrix[i][0] == 0){
                x_tag = true;
                break;
            }
        }

        for(int j = 0; j < y; j++){
            if(matrix[0][j] == 0){
                y_tag = true;
                break;
            }
        }

        for(int i = 1; i < x; i++){
            for(int j = 1; j < y; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for(int i = 1; i < x; i++){
            if(matrix[i][0] == 0){
                for(int j = 1; j < y; j++){
                    matrix[i][j] = 0;
                }
            }
        }

        for(int j = 1; j < y; j++) {
            if (matrix[0][j] == 0) {
                for(int i = 1; i < x; i++){
                    matrix[i][j] = 0;
                }
            }
        }

        if(x_tag){
            for(int i = 0; i < x; i++){
                matrix[i][0] = 0;
            }
        }

        if(y_tag){
            for(int j = 0; j < y; j++) {
                matrix[0][j] = 0;
            }
        }

    }
}