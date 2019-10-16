package com.xuhu.LeetCode.easy0053;

class Solution {
    public int maxSubArray(int[] nums) {
        // 解题思路：定义一个maxSum用作返回值，定义一个theSum用作临时存放暂时的最大值
        //for循环的意义代表：不断地记录第i个往前数的最大值
        //一旦，第i个数的值，比第i-1个数往前数的最大值都打，则区间浮动至i开始
        //每次比对之后，替换一下当前的最大值
        int maxSum = nums[0];
        int theSum = nums[0];
        for(int i = 1; i < nums.length; i++){
            theSum = Math.max(theSum + nums[i],nums[i]);
            if(theSum > maxSum){
                maxSum = theSum;
            }
        }

        return maxSum;
    }
}