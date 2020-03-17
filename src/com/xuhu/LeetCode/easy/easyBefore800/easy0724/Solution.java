package com.xuhu.LeetCode.easy.easyBefore800.easy0724;


class Solution {
    public int pivotIndex(int[] nums) {
        if(nums == null || nums.length == 0) return -1;
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        int before = 0;
        int end = sum - nums[0];
        int mid = 0;
        while (mid < nums.length &&before != end){
            before += nums[mid];
            mid++;
            end -= mid >= nums.length ? 0 : nums[mid];
        }
        return before == end && mid >= 0 && mid < nums.length ? mid : -1;
    }
}