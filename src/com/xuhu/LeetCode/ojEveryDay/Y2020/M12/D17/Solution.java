package com.xuhu.LeetCode.ojEveryDay.Y2020.M12.D17;


class Solution {
    public int maxProfit(int[] prices, int fee) {
        int len = prices.length;
        if (len == 0){
            return 0;
        }
        // 表示当前持有最大值
        int dp_1 = -prices[0];
        // 表示当前不持有最大值
        int dp_2 = 0;
        for (int i = 1; i < len; i++) {
            int temp_dp_1 = Math.max(dp_1, dp_2 - prices[i]);
            int temp_dp_2 = Math.max(dp_2, prices[i] + dp_1 - fee);
            dp_1 = temp_dp_1;
            dp_2 = temp_dp_2;
        }
        return dp_2;
    }
    public int maxProfit_old(int[] prices, int fee) {
        int len = prices.length;
        // 表示手上持有  的最大值
        int[] dp1 = new int[len];
        // 表示手上不持有的最大值
        int[] dp2 = new int[len];

        dp1[0] = -prices[0];
        dp2[0] = 0;
        for (int i = 1; i < len; i++){
            dp1[i] = Math.max(dp1[i-1], dp2[i-1] - prices[i]);
            dp2[i] = Math.max(dp2[i-1], prices[i] + dp1[i-1] - fee);
        }

        return dp2[len - 1];
    }
}