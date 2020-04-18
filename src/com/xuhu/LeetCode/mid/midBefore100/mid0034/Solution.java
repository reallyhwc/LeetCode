package com.xuhu.LeetCode.mid.midBefore100.mid0034;


class Solution {
    public int[] searchRange(int[] nums, int target) {

        int[] targetRange = {-1,-1};

        int leftIdx = extremeInsertionIndex(nums,target,true);

        if(leftIdx == nums.length || nums[leftIdx] != target){
            return targetRange;
        }

        targetRange[0] = leftIdx;
        targetRange[1] = extremeInsertionIndex(nums,target,false)-1;

        return targetRange;
    }


    // returns leftmost (or rightmost) index at which `target` should be
    // inserted in sorted array `nums` via binary search.
    private int extremeInsertionIndex(int[] nums, int target, boolean left) {
        int low = 0;
        int hig = nums.length;

        while (low < hig){
            int mid = (low + hig) / 2;
            if(nums[mid] > target || (left && target == nums[mid])){
                hig = mid;
            }else {
                low = mid + 1;
            }
        }

        return low;
    }
}