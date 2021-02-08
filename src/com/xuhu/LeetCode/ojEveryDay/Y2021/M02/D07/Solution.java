package com.xuhu.LeetCode.ojEveryDay.Y2021.M02.D07;


class Solution {
    public boolean checkPossibility(int[] nums) {
        if (nums.length <= 2){
            return true;
        }
        int count = 0;
        for (int i = 1; i < nums.length && count < 2; i++) {
            if (nums[i-1] > nums[i]){
                count++;
                // 核心是这个地方 可以结合这个用例理解下  3,4,2,3
                if (i - 2 >= 0 && nums[i-2] > nums[i]){
                    nums[i] = nums[i-1];
                }else {
                    nums[i-1] = nums[i];
                }
            }
        }
        return count < 2;
    }
}