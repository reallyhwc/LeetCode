package com.xuhu.LeetCode.mid.midBefore100.mid0055;


class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int rightMost = 0;
        for(int i = 0; i < n; i++){
            if(i <= rightMost){
                rightMost = Math.max(rightMost,i + nums[i]);
                if(rightMost >= n-1){
                    return true;
                }
            }
        }
        return false;
    }
//    public boolean canJump(int[] nums) {
//        if(nums == null) return false;
//        int len = nums.length;
//        if(len <= 1) return true;
//
//        return func(nums,len-1,0);
//    }
//
//    private boolean func(int[] nums, int lastIndex, int target){
//        if(target >= lastIndex) return true;
//        if(nums[target] == 0) return false;
//
//        for(int i = 1; i <= nums[target]; i++){
//            if(func(nums,lastIndex,target+i)){
//                return true;
//            }
//        }
//        return false;
//    }
}