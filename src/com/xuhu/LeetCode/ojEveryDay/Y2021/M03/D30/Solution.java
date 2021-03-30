package com.xuhu.LeetCode.ojEveryDay.Y2021.M03.D30;


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i = m - 1;
        int j = 0;
        while (i >= 0 && j <= n - 1){
            if (matrix[i][j] == target){
                return true;
            }else if (matrix[i][j] > target) {
                i--;
            }else {
                j++;
            }
        }

        return false;
    }
}