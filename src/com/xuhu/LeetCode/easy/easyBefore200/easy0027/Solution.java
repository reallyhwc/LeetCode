package com.xuhu.LeetCode.easy.easyBefore200.easy0027;

class Solution {
    public int removeElement(int[] nums, int val) {
        if(null == nums || nums.length == 0){
            return 0;
        }
        /**
         * 思路：
         * 从下标0开始，如果数组中的值与val相同，则把当前下标的值与‘目前’数组的
         * 最后一位替换（注意，并不是nums的最后一位，需要理解一下）
         * 并在循环中i--
         * i-- 的意思是，nums[i]与数组的最后一位替换了，数组的最后一位也有可能是val
         * 也需要继续比对一下，所以执行i--
         */
        int result = nums.length;
        int temp = 0;
        for(int i = 0; i < result; i++){
            if(val == nums[i]){
                temp = nums[i];
                nums[i] = nums[result - 1];
                nums[result - 1] = temp;
                result--;
                i--;
            }
        }
        return result;
    }
}