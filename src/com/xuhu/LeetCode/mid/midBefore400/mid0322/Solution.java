package com.xuhu.LeetCode.mid.midBefore400.mid0322;


import java.util.Arrays;

class Solution {
    /**
     * 经典动态规划   还需要任重而道远的学习啊！
     * @param coins
     * @param amount
     * @return
     */
    public int coinChange(int[] coins, int amount) {
        long[] ans = new long[amount + 1];
        Arrays.fill(ans, Integer.MAX_VALUE);
        ans[0] = 0;
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j <= amount; j++) {
                ans[j] = Math.min(ans[j], ans[j - coins[i]] + 1);
            }
        }
        return ans[amount] == Integer.MAX_VALUE ? -1 : (int) ans[amount];
    }
}