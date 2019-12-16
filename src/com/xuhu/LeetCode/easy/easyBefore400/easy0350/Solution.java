package com.xuhu.LeetCode.easy.easyBefore400.easy0350;


import java.util.Arrays;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] result = new int[Math.min(nums1.length, nums2.length)];
        int index = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                i++;
            }else if(nums1[i] > nums2[j]){
                j++;
            }else{
                result[index++] = nums1[i];
                i++;
                j++;
            }
        }
        return Arrays.copyOf(result,index);
    }
}