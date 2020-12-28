package com.xuhu.LeetCode.ojEveryDay.Y2020.M12.D28;


class Solution {
    /**
     当k大于等于数组长度一半时, 问题退化为贪心问题此时采用 买卖股票的最佳时机 II
     的贪心方法解决可以大幅提升时间性能, 对于其他的k, 可以采用 买卖股票的最佳时机 III
     的方法来解决, 在III中定义了两次买入和卖出时最大收益的变量, 在这里就是k租这样的
     变量, 即问题IV是对问题III的推广, t[i][0]和t[i][1]分别表示第i比交易买入和卖出时
     各自的最大收益
     **/
    public int maxProfit(int k, int[] prices) {
        if(k < 1){
            return 0;
        }
        int len = prices.length;
        // 当k大于等于数组长度一半时, 问题退化为贪心问题此时采用 买卖股票的最佳时机 II
        if (k >= len / 2) {
            return greedy(prices);
        }
        int[][] t = new int[len][2];
        for (int i = 0; i < len; i++) {
            t[i][0] = Integer.MIN_VALUE;
        }
        for (int p : prices){
            t[0][0] = Math.max(t[0][0], -p);
            t[0][1] = Math.max(t[0][1], t[0][0] + p);
            for (int i = 1; i < len; i++) {
                t[i][0] = Math.max(t[i][0], t[i-1][1] - p);
                t[i][1] = Math.max(t[i][1], t[i][0] + p);
            }
        }
        return t[k-1][1];
    }

    private int greedy(int[] prices){
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i-1]){
                max += (prices[i] - prices[i-1]);
            }
        }
        return max;
    }
}