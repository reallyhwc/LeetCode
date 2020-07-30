package com.xuhu.LeetCode.ojEveryDay.Y2020.M07.D30;


class Solution {

    /**
     *  数学方法，求函数y=(n/x)^x(x>0)的最大值，
     *  可得x=e时y最大，但只能分解成整数，故x取2或3，
     *  由于6=2+2+2=3+3，显然2^3=8<9=3^2,故应分解为多个3
     * @param n
     * @return
     */
    public int integerBreak(int n) {
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }
        int a = 1;
        while (n > 4) {
            n -= 3;
            a *= 3;
        }
        return a * n;
    }

    public int integerBreak1(int n) {
        int[] ans = new int[n + 1];
        ans[1] = 1;
        ans[2] = 1;
        for (int i = 3; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                ans[i] = Math.max(ans[i], Math.max(j * ans[i - j], j * (i - j)));
            }
        }
        return ans[n];
    }
}