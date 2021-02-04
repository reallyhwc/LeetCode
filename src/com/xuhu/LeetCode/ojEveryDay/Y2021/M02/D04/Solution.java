package com.xuhu.LeetCode.ojEveryDay.Y2021.M02.D04;


class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int len = nums.length;
        if (len < k){
            return -1.0;
        }
        long max;
        long nowTotal = 0;
        for (int i = 0; i < k; i++) {
            nowTotal += nums[i];
        }
        max = nowTotal;
        for (int i = k; i < len; i++){
            nowTotal -= nums[i-k];
            nowTotal += nums[i];
            max = Math.max(max, nowTotal);
        }
        return (double) max / k;
    }
}