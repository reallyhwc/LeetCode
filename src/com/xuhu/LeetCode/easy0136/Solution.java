package com.xuhu.LeetCode.easy0136;

class Solution {
    //利用异或的思想
    //一个数异或上他本身 = 0
    //0 ^ n = n
    public int singleNumber(int[] nums) {
        int num = 0;
        for(int X : nums){
            num ^= X;
        }
        return num;
    }
}