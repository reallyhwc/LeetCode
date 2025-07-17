package com.xuhu.LeetCode.easy02.easyBefore100.easy027;


class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int start = 0;
        int end = nums.length - 1;
        int temp = -1;
        while (start <= end) {
            if (nums[start] == val) {
                if (nums[end] == val) {
                    end--;
                } else {
                    temp = nums[start];
                    nums[start] = nums[end];
                    nums[end] = temp;
                }
            } else {
                start++;
            }
        }
        return start;
    }
}