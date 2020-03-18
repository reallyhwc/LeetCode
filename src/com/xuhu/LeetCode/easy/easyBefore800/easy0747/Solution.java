package com.xuhu.LeetCode.easy.easyBefore800.easy0747;

class Solution {
    public int dominantIndex(int[] nums) {
        int max = 0;
        int idx = 0;
        int lastMax = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                lastMax = max;
                max = nums[i];
                idx = i;
            }else if(nums[i] > lastMax){
                lastMax = nums[i];
            }
        }
        return max >= (lastMax * 2) ? idx : -1;
    }
}