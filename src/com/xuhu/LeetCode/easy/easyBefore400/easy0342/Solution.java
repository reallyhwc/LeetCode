package com.xuhu.LeetCode.easy.easyBefore400.easy0342;


class Solution {
    public boolean isPowerOfFour(int num) {
//        return ((num & 0x55555555) != 0) && ((num & (num - 1)) == 0);
        return (num > 0 && ((num & (num - 1)) == 0) && (num & 0xaaaaaaaa) == 0);
    }
}