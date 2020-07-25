package com.xuhu.LeetCode.mid.midBefore400.mid0309;


class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int n = prices.length;
        // 表示 我目前持有一只股票，对应的累计最大收益 要想第一步之后手中就有一只股票，那么就只能第一步就购买
        // 累计最大收益为负数
        int f0 = -prices[0];
        // 表示 我目前不持有任何股票，并且处于冷冻期中，对应的累计最大收益
        int f1 = 0;
        // 表示 我目前不持有任何姑表，并且吧不处于冷冻期中（可以随时购买）
        int f2 = 0;
        for (int i = 1; i < n; i++) {
            // newF0 的值 = 要么继续持有，要么购买持有股票
            int newF0 = Math.max(f0,f2-prices[i]);
            // 而newF1的值，表示处于冷冻期中，为了达到这个目的，只能卖掉手上的股票
            int newF1 = f0 + prices[i];
            // f2 表示的是 手上没有股票且能随时购买 只能从f1 f2中进行状态转换
            int newF2 = Math.max(f1,f2);
            f0 = newF0;
            f1 = newF1;
            f2 = newF2;
        }
        return Math.max(f1,f2);
    }
}