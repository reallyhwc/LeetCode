package com.xuhu.LeetCode.game.week.W2020_10_04.T01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        int ans = -1;
        if (nums[0] >= length){
            return length;
        }
        for (int i = 1; i < length; i++){
            if (nums[length-i] >= i && nums[length-i-1] < i){
                return i;
            }
        }

        return -1;
    }
}