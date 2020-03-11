package com.xuhu.LeetCode.easy.easyBefore600.easy0581;


class Solution {
    public int findUnsortedSubarray(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int high = 0;
        int low = nums.length - 1;
        int maxNum = nums[0];
        int minNum = nums[low];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < maxNum){
                high = i;
            }else {
                maxNum = nums[i];
            }
        }
        for(int j = nums.length - 1; j >= 0; j--){
            if(nums[j] > minNum){
                low = j;
            }else {
                minNum = nums[j];
            }
        }

        return (high - low) > 0 ? (high - low + 1) : 0;
    }
}