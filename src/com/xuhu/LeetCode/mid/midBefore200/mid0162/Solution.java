package com.xuhu.LeetCode.mid.midBefore200.mid0162;


class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        // 迭代二分 每次缩减区间时，往趋向于提升的方向缩减
        while (left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] > nums[mid+1]){
                right = mid;
            }else {
                left = mid+1;
            }
        }
        return left;
    }
}