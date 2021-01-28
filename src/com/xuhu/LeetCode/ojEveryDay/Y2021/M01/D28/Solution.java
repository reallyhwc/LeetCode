package com.xuhu.LeetCode.ojEveryDay.Y2021.M01.D28;


class Solution {
    public int pivotIndex(int[] nums) {
        if (nums == null || nums.length == 0){
            return -1;
        }
        if (nums.length == 1){
            return 0;
        }
        int sum = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            sum += nums[i];
        }
        int rightSum = sum;
        for (int i = 0; i < len; i++) {
            rightSum -= nums[i];
            if (rightSum * 2 ==  (sum - nums[i]) ){
                return i;
            }
        }
        return -1;
    }
}