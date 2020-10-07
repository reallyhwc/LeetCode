package com.xuhu.LeetCode.ojEveryDay.Y2020.M10.D07;


class Solution {
    public void sortColors(int[] nums) {
        int p0 = 0;
        int curr = 0;

        int p2 = nums.length - 1;

        while (curr <= p2){
            if (nums[curr] == 0){
                swap(nums,curr,p0);
                curr++;
                p0++;
            }else if (nums[curr] == 2){
                swap(nums,curr,p2);
                p2--;
            }else {
                curr++;
            }
        }
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}