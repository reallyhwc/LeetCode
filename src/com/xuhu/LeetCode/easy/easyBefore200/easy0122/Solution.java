package com.xuhu.LeetCode.easy.easyBefore200.easy0122;

class Solution {
    public int maxProfit(int[] prices) {
        //贪就完了
        //只要明天能涨，就今天买明天卖，并把交易差累积到总的利润中去
        //涨不了，就不买
        if(null == prices || prices.length <= 1){
            return 0;
        }
        int result = 0;
        for(int i = 0; i < prices.length - 1; i++){
            if(prices[i] < prices[i + 1]){
                result += (prices[i+1] - prices[i]);
            }
        }
        return result;
    }
}