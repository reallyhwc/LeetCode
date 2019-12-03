package com.xuhu.LeetCode.easy.easyBefore300.easy0268;


//使用异或的方式
// 0 ^ X = X
// X ^ X = 0
class Solution {
    public int missingNumber(int[] nums) {
        int res = 0;
        for(int i = 0 ; i < nums.length; i++){
            res ^= nums[i];
            res ^= (i+1);
        }
        return res;
    }
}