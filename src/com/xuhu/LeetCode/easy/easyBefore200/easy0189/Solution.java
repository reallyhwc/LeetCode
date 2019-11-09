package com.xuhu.LeetCode.easy.easyBefore200.easy0189;


class Solution {
    //使用时间复杂度最简洁的一种解法：
    //整个数组左右翻转后再根据截取位置分作左右部分翻转
    public void rotate(int[] nums, int k) {
        if(null == nums || nums.length <= 1){
            return ;
        }
        k = k % nums.length;
        method(nums,0,nums.length - 1);
        method(nums,0,k - 1);
        method(nums,k,nums.length - 1);
    }

    private void method(int[] nums, int left, int right){
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}