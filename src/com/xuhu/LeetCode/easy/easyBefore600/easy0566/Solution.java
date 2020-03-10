package com.xuhu.LeetCode.easy.easyBefore600.easy0566;


class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if(nums == null || nums.length == 0 || nums[0].length == 0){
            return null;
        }
        int numsHeigth = nums.length;
        int numsWidth = nums[0].length;
        if(r * c != numsHeigth * numsWidth){
            return nums;
        }
        int[][] result = new int[r][c];
        int now_i = 0;
        int now_j = 0;
        for(int i = 0; i < numsHeigth; i++){
            for(int j = 0; j < numsWidth; j++){
                result[now_i][now_j] = nums[i][j];
                now_j++;
                if(now_j >= c){
                    now_i++;
                    now_j = 0;
                }
            }
        }
        return result;
    }
}