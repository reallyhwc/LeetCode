package com.xuhu.LeetCode.mid.midBefore300.mid0201;


class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        int i = 0;
        while (m != n){
            m = m>>>1;
            n = n>>>1;
            i++;
        }
        return m << i;
    }
}