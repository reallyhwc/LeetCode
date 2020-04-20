package com.xuhu.LeetCode.mid.midBefore100.mid0048;


class Solution {
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        rand(matrix,0,len-1,len-1);
    }

    public void rand(int[][] matrix, int start, int end, int num){
        if(start < end){
            for(int i = 0; i < num; i++){
                int temp = matrix[start][start+i];
                matrix[start][start+i] = matrix[end-i][start];
                matrix[end-i][start] = matrix[end][end-i];
                matrix[end][end-i] = matrix[start+i][end];
                matrix[start+i][end] = temp;
            }
            rand(matrix,start+1, end-1, num - 2);
        }
    }
}