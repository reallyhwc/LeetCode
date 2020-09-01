package com.xuhu.LeetCode.ojEveryDay.Y2020.M09.D01;


class Solution {
    /**
     * 对于偶数个数字的数组，玩家1一定获胜。因为如果玩家1选择拿法A，
     * 玩家2选择拿法B，玩家1输了。则玩家1换一种拿法选择拿法B，因为玩家1是先手，所以玩家1一定可以获胜。
     *
     * 对于奇数个数字的数组，利用动态规划(dynamic programming)计算。
     * 首先证明最优子结构性质。对于数组[1..n]中的子数组[i..j]，
     * 假设玩家1在子数组[i..j]中的拿法是最优的，即拿的分数比玩家2多出最多。
     * 假设玩家1拿了i，则[i+1..j]中玩家1拿的方法也一定是最优的。
     * 利用反证法证明：如果玩家1在[i+1..j]中有更优的拿法，即玩家1在[i+1...j]可以拿到更多的分数，
     * 则玩家在[i..j]中拿到的分数就会比假设的最优拿法拿到的分数更多，显然矛盾。
     * 如果玩家1拿了j，同理可证矛盾。 所以当前问题的最优解包含的子问题的解一定也是子问题的最优解。
     *
     * 对于只有一个数字的子数组,即i=j，dp[i][i] = num[i]，
     * 因为玩家1先手拿了这一个分数，玩家2就没得拿了，所以是最优拿法。
     * 对于两个数字的子数组,即j-i=1，dp[i][j]=abs(num[i]-num[j]),
     * 玩家1先手拿两个数中大的一个，所以玩家1一定比玩家2多两个数字差的绝对值，
     * 为最优拿法。
     * 对于j-i>1的子数组，如果玩家1先手拿了i，则玩家1手里有num[i]分，
     * 则玩家2一定会按照[i+1..j]这个子数组中的最优拿法去拿，于是玩家2此时手里相当于有dp[i+1][j]分，
     * 于是玩家1比玩家2多num[i]-dp[i+1][j]分。如果玩家1先手拿了j，则玩家1手里有num[j]分，
     * 则玩家2一定会按照[i..j-1]这个子数组中的最优拿法去拿，于是玩家2此时手里相当于有dp[i][j-1]分，
     * 于是玩家1比玩家2多num[j]-dp[i][j-1]分。数组的填充方向是从下往上，从左到右，最后填充的是dp[1][n]。
     */
    public boolean PredictTheWinner(int[] nums) {
        int length = nums.length;
        if (nums.length % 2 == 0){
            return true;
        }
        int[] dp = new int[length];
        for (int i = 0; i < length; i++) {
            dp[i] = nums[i];
        }
        for (int i = length - 2; i >= 0; i--) {
            for (int j = i + 1; j < length; j++) {
                dp[j] = Math.max(nums[i] - dp[j], nums[j] - dp[j - 1]);
            }
        }
        return dp[length - 1] >= 0;
    }


    /**
     * 暴力递归
     *
     * @param nums
     * @return
     */
    public boolean PredictTheWinner1(int[] nums) {
        return total(nums, 0, nums.length - 1, 1) >= 0;
    }

    /**
     * @param nums  当前数组
     * @param start start下标
     * @param end   end下标
     * @param turn  轮次 正数为玩家1取值 负数为玩家2 取值
     * @return 当前总分（玩家1累计总分 - 玩家2 累计总分）
     */
    private int total(int[] nums, int start, int end, int turn) {
        // 如果当前
        if (start == end) {
            return nums[start] * turn;
        }
        int scoreStart = nums[start] * turn + total(nums, start + 1, end, -turn);
        int scoreEnd = nums[end] * turn + total(nums, start, end - 1, -turn);
        // 返回当前轮次的绝对值最大值（即使玩家2 取值，也要让这个数最小-》即玩家2 所能获取到的范围区间值最大）
        return Math.max(scoreStart * turn, scoreEnd * turn) * turn;
    }
}