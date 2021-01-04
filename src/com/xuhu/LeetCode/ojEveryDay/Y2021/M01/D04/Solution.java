package com.xuhu.LeetCode.ojEveryDay.Y2021.M01.D04;


class Solution {
    public int fib(int n) {
        if (n <= 0){
            return 0;
        }
        if (n <= 2){
            return 1;
        }
        int a1 = 1;
        int a2 = 1;
        for (int i = 2; i < n; i++) {
            int sum = a1 + a2;
            a1 = a2;
            a2 = sum;
        }
        return a2;
    }
}