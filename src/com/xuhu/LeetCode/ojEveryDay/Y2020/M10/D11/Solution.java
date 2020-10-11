package com.xuhu.LeetCode.ojEveryDay.Y2020.M10.D11;


class Solution {
    public boolean canPartition(int[] nums) {
        // 数组长度不超过2 返回false
        if(null == nums || nums.length < 2){
            return false;
        }
        // 求总和
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        // 如果总和不为偶数，那么题意情况也不可能成立 返回false
        if ((sum & 1) == 1){
            return false;
        }

        // 接下来我们的问题就简化成了，我们能不能从数组中找出一些数字之和为 sum / 2  转换成了一个 0 1 背包问题，
        // 可以利用动态规划来求解，这里需要注意的是，每个数字仅能使用一次，且目的为 数字和恰好为 2 / sum

        int target = sum / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;

        if (nums[0] <= target) {
            dp[nums[0]] = true;
        }
        for (int i = 1; i < nums.length; i++) {
            for (int j = target; nums[i] <= j; j--) {
                if (dp[target]) {
                    return true;
                }
                dp[j] = dp[j] || dp[j - nums[i]];
            }
        }
        return dp[target];
    }
}