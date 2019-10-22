package com.xuhu.LeetCode.easy0069;


// 牛顿法
// f(x) = x^2 - a
// 求解 a 的平方根, 即求解 f(x) = 0 的解

// f(x) ~= f(x0) + (x - x0) * f'(x0);
// 令 f(x) = 0   =>   x = (x0 + a/x0) /2	=>    得到该迭代公式.

class Solution {
    public int mySqrt(int a) {
        long x0 = a;

        while (x0*x0 > a) {
            x0 = (x0 + a / x0) / 2;
        }
        return (int)x0;
    }
}