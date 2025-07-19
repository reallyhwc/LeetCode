package com.xuhu.LeetCode.easy02.easyBefore100.easy035;


class Solution {
    public int searchInsert(int[] nums, int target) {


        if (nums == null || nums.length == 0) {
            return 0;
        }
        int length = nums.length;
        int start = 0;
        int end = length - 1;
        int ans = length;
        while (start <= end) {
            int mid = ((end - start) >> 1) + start;

            if (target <= nums[mid]) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}