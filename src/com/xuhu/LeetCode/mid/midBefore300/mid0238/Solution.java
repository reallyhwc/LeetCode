package com.xuhu.LeetCode.mid.midBefore300.mid0238;


import java.util.Arrays;

class Solution {
    /**
     * 比采用多次for循环的方法看起来更为简洁直观
     * left表示累计当前的左边乘积
     * right表示累计当前的右边乘积
     * @param nums
     * @return
     */
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] ans = new int[length];
        for (int i = 0; i < length; i++){
            ans[i] = 1;
        }

        int left = 1;
        int right = 1;
        for (int i =0; i < length; i++){
            ans[i] *= left;
            left *= nums[i];
            ans[length - 1 -i] *= right;
            right *= nums[length-1-i];
        }
        return ans;
    }
}