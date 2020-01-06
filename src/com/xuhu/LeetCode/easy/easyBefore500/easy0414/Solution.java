package com.xuhu.LeetCode.easy.easyBefore500.easy0414;


class Solution {

    private long MIN = Long.MIN_VALUE;

    public int thirdMax(int[] nums) {
        if(null == nums || nums.length == 0){
            return -1;
        }

        int one = nums[0];
        long two = MIN;
        long thr = MIN;
        for(int i = 1; i < nums.length; i++){
            int num = nums[i];
            if(num == one || num == two || num == thr){
                continue;
            }
            if(num > one){
                thr = two;
                two = one;
                one = num;
            }else if(num > two){
                thr = two;
                two = num;
            }else if(num > thr){
                thr = num;
            }
        }
        if(thr == MIN){
            return one;
        }
        return (int)thr;
    }
}