package com.xuhu.LeetCode.ojEveryDay.Y2020.M12.D21;


class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int  len = cost.length;
        if (len <= 1) {
            return 0;
        }
        int[] ans = new int[len+1];
        ans[0] = 0;
        ans[1] = 0;
        for (int i = 2; i <= len; i++) {
            ans[i] = Math.min(ans[i-1] + cost[i-1], ans[i-2] + cost[i-2]);
        }
        return ans[len];

    }
}