package com.xuhu.LeetCode.mid.midBefore300.mid0213;


class Solution {
    // 思路上-拆分成两个array 一个不偷最后一家，一个不偷第一家 剩下无所谓
    // 返回两个结果中大的一个即可
    public int rob(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int length = nums.length;
        if(length == 1){
            return nums[0];
        }
        if(length == 2){
            return Math.max(nums[0],nums[1]);
        }
        int[] ans1 = new int[length];
        ans1[0] = nums[0];
        ans1[1] = Math.max(nums[0],nums[1]);
        int[] ans2 = new int[length];
        ans2[1] = nums[1];
        ans2[2] = Math.max(nums[1],nums[2]);

        for (int i = 2; i < length-1; i++){
            ans1[i] = Math.max(ans1[i-1], ans1[i-2]+nums[i]);
        }
        for (int i = 3; i < length; i++){
            ans2[i] = Math.max(ans2[i-1], ans2[i-2] + nums[i]);
        }
        return Math.max(ans1[length-2],ans2[length-1]);
    }
}