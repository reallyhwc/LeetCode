package com.xuhu.LeetCode.mid.midBefore200.mid0153;


class Solution {
    public int findMin(int[] nums) {
        // 如果长度为1 直接返回唯一数即可
        if(nums.length == 1){
            return nums[0];
        }
        // 定义左右指针
        int left = 0;
        int right = nums.length-1;
        // 如果第一个数小于最后一个数，说明整个数组是有序的
        if(nums[left] < nums[right]){
            return nums[left];
        }

        while (left <= right){
            // 求中间值 并避免Integer类型溢出
            int mid = left + (right - left) / 2;
            // 出现了前一个值比后一个大的情况 根据题目描述 则后一个为最小值
            if(nums[mid] > nums[mid+1]){
                return nums[mid+1];
            }
            if(mid > 0 && nums[mid-1] > nums[mid]){
                return nums[mid];
            }

            if(nums[mid] > nums[0]){
                // 说明前半段有序
                left = mid+1;
            }else {
                right = mid-1;
            }
        }
        return -1;
    }
}