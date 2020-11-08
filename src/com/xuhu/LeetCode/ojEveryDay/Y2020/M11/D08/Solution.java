package com.xuhu.LeetCode.ojEveryDay.Y2020.M11.D08;


class Solution {
    public int maxProfit(int[] prices) {
        // 贪就是了！ 是要今天买明天卖能赚钱，就这么干一下，不然就不买
        if (null == prices || prices.length <= 1){
            return 0;
        }
        int ans = 0;
        for (int i = 0; i < prices.length-1; i++) {
            if (prices[i] < prices[i+1]){
                ans += (prices[i+1] - prices[i]);
            }
        }
        return ans;
    }
}