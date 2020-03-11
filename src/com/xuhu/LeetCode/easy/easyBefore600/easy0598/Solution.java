package com.xuhu.LeetCode.easy.easyBefore600.easy0598;

class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        if(ops == null || ops.length <= 0){
            return  m * n;
        }
        int minA = ops[0][0];
        int minB = ops[0][1];
        for(int[] nums: ops){
            if(nums[0] < minA){
                minA = nums[0];
            }
            if(nums[1] < minB){
                minB = nums[1];
            }
        }
        return minA * minB;
    }
}