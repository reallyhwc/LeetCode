package com.xuhu.LeetCode.easy.easyBefore700.easy643;


class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums == null || nums.length < k){
            return -1.0d;
        }
        if(k <= 0) return -1.0d;
        int total = 0;
        int nowArraySum = 0;
        for(int i = 0; i < k; i++){
            total += nums[i];
        }
        nowArraySum = total;
        for(int i = k; i < nums.length; i++){
            nowArraySum -= nums[i-k];
            nowArraySum += nums[i];
            total = Math.max(total,nowArraySum);
        }
        return (double)total / k;
    }
}