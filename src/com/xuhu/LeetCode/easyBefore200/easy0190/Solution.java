package com.xuhu.LeetCode.easyBefore200.easy0190;


public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        //定义一个返回数
        //循环的一位一位的去取出来二进制表示的某一位数，然后再移位，也就是
        //等效于，颠倒了二进制情况的表示
        int result = 0;
        for(int i = 0; i <= 31; i++){
            result = result + ((1&(n>>i))<<(31-i));
        }
        return result;
    }
}