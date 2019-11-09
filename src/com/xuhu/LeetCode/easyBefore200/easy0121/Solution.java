package com.xuhu.LeetCode.easyBefore200.easy0121;


class Solution {
    public int maxProfit(int[] prices) {
        if(null == prices || prices.length <= 1){
            return 0;
        }
        int min = prices[0];
        int max = 0;
        for(int i = 1; i < prices.length; i++){
            max = Math.max(max,prices[i] - min);
            min = Math.min(min,prices[i]);
        }
        return max;
    }
}