package com.xuhu.LeetCode.mid.midBefore100.mid0033;


class Solution {
    /**
     * 思路：如果中间的数小于最右边的数，则右半段是有序的，
     * 若中间数大于最右边数，则左半段是有序的，
     * 我们只要在有序的半段里用首尾两个数组来判断目标值是否在这一区域内，
     * 这样就可以确定保留哪半边了
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        int len = nums.length;
        int left = 0;
        int right = len - 1;
        while (left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == target){
                //如果相等，返回下标
                return mid;
            }else if(nums[mid] < nums[right]){
                //暂时无法确定哪半段有序

                //
                if(nums[mid] < target && target <= nums[right]){
                    left = mid+1;
                }else {
                    right = mid-1;
                }
            }else {
                if(nums[left] <= target && target < nums[mid]){
                    right = mid - 1;
                }else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }
}