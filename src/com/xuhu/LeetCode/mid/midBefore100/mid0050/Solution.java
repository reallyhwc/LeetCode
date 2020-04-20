package com.xuhu.LeetCode.mid.midBefore100.mid0050;


class Solution {
    public double myPow(double x, int n) {
        double ans = 1.0;
        for(int i = n; i != 0; i /= 2){
            if(i%2 != 0){
                ans *= x;
            }
            x *= x;
        }
        return n < 0 ? 1 / ans : ans;
    }
}