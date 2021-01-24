package com.xuhu.LeetCode.ojEveryDay.Y2021.M01.D24;


class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length <= 1){
            return nums.length;
        }
        int max = 1;
        int nowNum = 1;
        int last = nums[0];
        for (int i = 1; i < nums.length; i++){
            if (nums[i] > last){
                nowNum++;
            }else {
                max = Math.max(max, nowNum);
                nowNum = 1;
            }

            last = nums[i];
        }
        max = Math.max(max, nowNum);
        return max;
    }
}