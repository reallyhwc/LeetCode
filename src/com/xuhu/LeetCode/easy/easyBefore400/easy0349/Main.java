package com.xuhu.LeetCode.easy.easyBefore400.easy0349;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        for(int X : solution.intersection(nums1,nums2)){
            System.out.println(X);
        }
    }
}