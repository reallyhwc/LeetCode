package com.xuhu.LeetCode.easy.easyBefore200.easy0198;

class Solution {
    public int rob(int[] nums) {
        if(null == nums || nums.length == 0){
            return 0;
        }
        int length = nums.length;
        if(length == 1){
            return nums[0];
        }
        //首先定义一个返回数组，用来存储，对于前N间房子，小偷盗窃的利益最大值
        //那么这个数组的最后一位就是 所需要返回的最大值
        int[] result = new int[length];
        result[0] = nums[0];
        result[1] = Math.max(nums[0],nums[1]);
        //运用深搜的思想
        //在计算第I个的时候，要么选择这一家不偷，利益为result[i-1]
        //要么选择这一家要去偷，利益为 result[i-2] + nums[i]
        //取这两个值之间的最大值
        for(int i = 2; i < length; i++){
            result[i] = Math.max(result[i-1],result[i-2] + nums[i]);
        }
        return result[length-1];
    }


    //优化时间复杂度法
    //不需要太多额外的空间去存储
    public int rob1(int[] nums) {
        int dp1 = 0;
        int dp2 = 0;
        for(int X : nums){
            int temp = dp1;
            dp1 = Math.max(dp1,dp2 + X);
            dp2 = temp;
        }
        return dp1;
    }
}