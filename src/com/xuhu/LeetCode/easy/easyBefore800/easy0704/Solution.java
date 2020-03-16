package com.xuhu.LeetCode.easy.easyBefore800.easy0704;


class Solution {
    public int search(int[] nums, int target) {
        return search_erfen(nums,target,0,nums.length-1);
    }

    private int search_erfen(int[] nums,int target, int begin, int end){
        if(begin > end || begin < 0 || end >= nums.length) return -1;
        int mid = (begin + end) / 2;
        if(nums[mid] == target) return mid;
        if(nums[mid] < target) return search_erfen(nums,target,mid+1,end);
        if(nums[mid] > target) return search_erfen(nums,target,begin,mid-1);

        return -1;
    }
}