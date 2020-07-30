package com.xuhu.LeetCode.mid.midBefore400.mid0322;


import java.util.Arrays;

class Solution {

    int ans = Integer.MAX_VALUE;

    public int coinChange(int[] coins, int amount) {
        // 排序，优先用面额大的
        Arrays.sort(coins);
        dfs(coins, coins.length - 1, amount, 0);
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    public void dfs(int[] coins, int index, int amount, int cnt) {
        if (index < 0) {
            return;
        }
        int max = amount / coins[index];
        // 多往少，因为硬币是从大到小的，所以是尽量用多的大的硬币
        for (int c = max; c >= 0; c--) {
            int newAmount = amount - c * coins[index];
            int newCoinCount = cnt + c;

            // newAmount == 0 时, 得到解答, 记录最小值
            // 剪枝是因为大面值硬币需要更多小面值硬币替换，继续减少一枚或几枚大硬币搜索出来的答案【如果有】肯定不会更优。
            if (newAmount == 0) {
                ans = Math.min(ans, newCoinCount);
                break;//剪枝1
            }
            if (newCoinCount + 1 >= ans) {
                break; //剪枝2
            }
            dfs(coins, index - 1, newAmount, newCoinCount);
        }
    }

    /**
     * 经典动态规划   还需要任重而道远的学习啊！
     *
     * @param coins
     * @param amount
     * @return
     */
    public int coinChange1(int[] coins, int amount) {
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