package com.xuhu.LeetCode.easy02.easyBefore100.easy069;


class Solution {
    public int mySqrt(int a) {
        long x0 = a;

        while (x0 * x0 > a) {
            x0 = (x0 + a / x0) / 2;
        }
        return (int) x0;
    }
}