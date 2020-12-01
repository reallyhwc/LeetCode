package com.xuhu.LeetCode.ojEveryDay.Y2020.M12.D01;


class Solution {
    int[] searchRange(int[] nums, int target) {
        return new int[]{findBegin(nums, target), findEnd(nums, target)};
    }

    private int findBegin(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        int len = nums.length;
        int begin = 0;
        int end = len - 1;
        while (begin <= end) {
            int mid = end - ((end - begin) >> 1);
            if (nums[mid] < target) {
                begin = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                if (mid == 0 || nums[mid - 1] != nums[mid]) {
                    return mid;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }

    private int findEnd(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        int len = nums.length;
        int begin = 0;
        int end = len - 1;

        while (begin <= end) {
            int mid = end - ((end - begin) >> 1);
            if (nums[mid] < target) {
                begin = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                if (mid == len - 1 || nums[mid] != nums[mid + 1]) {
                    return mid;
                } else {
                    begin = mid + 1;
                }
            }
        }

        return -1;
    }
}