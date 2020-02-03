package com.xuhu.LeetCode.easy.easyBefore500.easy0453;


class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        int ans = 0;
        for(int num : nums){
            if(num < min){
                min = num;
            }
        }

        for(int num : nums){
            ans += (num - min);
        }
        return ans;
    }
}