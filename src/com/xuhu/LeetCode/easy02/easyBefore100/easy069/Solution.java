package com.xuhu.LeetCode.easy02.easyBefore100.easy069;


class Solution {
    public int mySqrt(int a) {
        long x0 = a;
        // 牛顿迭代法快速求解，正常也可以使用二分法持续迭代
        while (x0 * x0 > a) {
            x0 = (x0 + a / x0) / 2;
        }
        return (int) x0;
    }
}