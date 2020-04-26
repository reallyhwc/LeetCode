package com.xuhu.LeetCode.mid.midBefore100.mid0080;


class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length <= 2) return nums.length;
        int before = 0;
        int end = 1;
        int target = nums[0];
        int targetNums = 1;
        while (end < nums.length){
            if(nums[end] == target){
                targetNums++;
                if(targetNums <= 2){
                    nums[++before] = target;
                }
            }else {
                target = nums[end];
                targetNums = 1;
                nums[++before] = target;
            }
            end++;
        }

        return before + 1;
    }
}