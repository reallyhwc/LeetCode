package com.xuhu.LeetCode.easy.easyBefore400.easy0303;

public class Main {
    public static void main(String[] args){
        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArray array = new NumArray(nums);
        System.out.println(array.sumRange(0,2));
        System.out.println(array.sumRange(2,5));
        System.out.println(array.sumRange(0,5));
    }
}