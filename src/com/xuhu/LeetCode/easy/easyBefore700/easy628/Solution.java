package com.xuhu.LeetCode.easy.easyBefore700.easy628;


import java.util.Arrays;

class Solution {
    public int maximumProduct(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 2){
            return nums[0] * nums[1];
        }
        Arrays.sort(nums);
        return Math.max(nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3], nums[nums.length - 1] * nums[1] * nums[0]);
    }
}