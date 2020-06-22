package com.xuhu.LeetCode.mid.midBefore200.mid0152;


class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int iMax = 1;
        int iMin = 1;
        for (int i = 0; i < nums.length; i++){
            // 如果是负数，那么在后面一步相乘的时候，正负号会颠倒，所以在这里提前交换
            if(nums[i] < 0){
                int temp = iMax;
                iMax = iMin;
                iMin = temp;
            }
            iMax = Math.max(iMax*nums[i],nums[i]);
            iMin = Math.min(iMin*nums[i],nums[i]);
            max = Math.max(max,iMax);
        }
        return max;
    }
}