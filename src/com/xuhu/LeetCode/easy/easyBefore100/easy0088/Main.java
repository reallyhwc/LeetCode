package com.xuhu.LeetCode.easy.easyBefore100.easy0088;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        solution.merge(nums1,3,nums2,3);
        for(int X : nums1){
            System.out.println(X);
        }

    }
}