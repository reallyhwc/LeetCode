package com.xuhu.LeetCode.mid.midBefore400.mid0324;


import java.util.Arrays;

class Solution {
    public void wiggleSort(int[] nums) {
        int[] temp = Arrays.copyOf(nums, nums.length);
        int n = nums.length;
        int k = (n+1)/2;
        int j = n;
        Arrays.sort(temp);
        for (int i = 0; i < n; i++) {
            nums[i] = (i&1) == 1 ? temp[--j] : temp[--k];
        }
    }
}