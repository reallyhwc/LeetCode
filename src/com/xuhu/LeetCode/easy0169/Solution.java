package com.xuhu.LeetCode.easy0169;


class Solution {
    public int majorityElement(int[] nums) {

        //从第一个数开始count=1，遇到相同的就加1，遇到不同的就减1，减到0就重新换个数开始计数，总能找到最多的那个
        if(null == nums || nums.length == 0){
            return 0;
        }
        int num = 1;
        int result = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == result){
                num++;
            }else{
                num--;
                if(num == 0){
                    num = 1;
                    result = nums[i];
                }
            }
        }
        return result;
    }
}