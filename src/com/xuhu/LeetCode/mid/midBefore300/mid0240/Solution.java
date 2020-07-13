package com.xuhu.LeetCode.mid.midBefore300.mid0240;


class Solution {
    /**
     * 整个算法的思路的最关键的地方
     * 题意所描述的矩阵，左下角的那个值，是这一列最大的，也是这一行最小的
     * 理解了这一行就可以理解整个题目的思路及含义
     * @param matrix
     * @param target
     * @return
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        if (null == matrix || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        // 行的下标
        int i = matrix.length - 1;
        // 列的下标
        int j = 0;
        // 即： 最后一行的第一个，即为矩阵的左下角，也是这一行的最小值，这一列的最大值
        while (i >= 0 && j < matrix[0].length){
            if (matrix[i][j] == target){
                return true;
            }else if (matrix[i][j] > target){
                i--;
            }else if (matrix[i][j] < target){
                j++;
            }
        }
        return false;
    }
}