package com.xuhu.LeetCode.easy.easyBefore700.easy674;


class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums == null){
            return 0;
        }
        if(nums.length <= 1){
            return nums.length;
        }
        int count = 1;
        int max = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i-1]){
                count++;
            }else if(count != 1) {
                max = Math.max(max,count);
                count = 1;
            }
        }
        max = Math.max(max,count);
        return max <= nums.length ? max : nums.length;
    }
}