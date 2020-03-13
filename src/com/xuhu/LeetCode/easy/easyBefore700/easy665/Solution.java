package com.xuhu.LeetCode.easy.easyBefore700.easy665;


class Solution {
    public boolean checkPossibility(int[] nums) {
        if(nums == null || nums.length < 2){
            return true;
        }
        int count = 0;
        for(int i = 1; i < nums.length && count < 2; i++){
            if(nums[i] < nums[i-1]){
                count++;
                if(i - 2 >= 0 && nums[i-2] > nums[i]){
                    nums[i] = nums[i-1];
                }else {
                    nums[i-1] = nums[i];
                }
            }
        }
        return count <= 1;
    }
}