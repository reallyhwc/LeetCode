package com.xuhu.LeetCode.ojEveryDay.Y2020.M11.D19;


class Solution {
    public void moveZeroes(int[] nums) {
        int numIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                nums[numIndex++] = nums[i];
            }
        }
        for (int i = numIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}