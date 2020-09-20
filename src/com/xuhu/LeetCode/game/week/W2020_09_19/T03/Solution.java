package com.xuhu.LeetCode.game.week.W2020_09_19.T03;


class Solution {
    public int minSubarray(int[] nums, int p) {
        long total = 0;
        for (int num : nums){
            total += num;
        }
        if (total % p == 0){
            return 0;
        }
        return 0;
    }
}