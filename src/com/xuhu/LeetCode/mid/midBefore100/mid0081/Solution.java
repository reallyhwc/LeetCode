package com.xuhu.LeetCode.mid.midBefore100.mid0081;


class Solution {
    public boolean search(int[] nums, int target) {
        for(int num : nums){
            if(num == target){
                return true;
            }
        }
        return false;
    }

    public boolean search1(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target)
                return true;
            if(nums[start]<nums[mid]){
                if(nums[mid]>=target&&target>=nums[start]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else if(nums[end]>nums[mid]){
                if(nums[mid]<=target&&target<=nums[end]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }else{
                if(nums[mid]==nums[start])
                    start++;
                else
                    end--;
            }
        }
        return false;
    }
}