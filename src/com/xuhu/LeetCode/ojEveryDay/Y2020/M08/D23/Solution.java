package com.xuhu.LeetCode.ojEveryDay.Y2020.M08.D23;

class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        int offset = 0;
        for (; m != n; ++offset) {
            m >>= 1;
            n >>= 1;
        }
        return n << offset;
    }
}