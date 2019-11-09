package com.xuhu.LeetCode.easy.easyBefore200.easy0191;


public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int result = 0;
        //一位一位的去判断，如果该位二进制表示为1 则result++
        for(int i = 0; i <= 31; i++){
            if((1&(n>>i)) == 1){
                result++;
            }
        }
        return result;
    }
}