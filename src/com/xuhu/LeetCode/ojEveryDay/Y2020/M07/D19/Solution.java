package com.xuhu.LeetCode.ojEveryDay.Y2020.M07.D19;


class Solution {
    /**
     * dp[i][j] 表示填满开区间 (i,j)(i,j) 能得到的最多硬币数，
     * 那么边界条件是 i \geq j-1i≥j−1，此时有 dp[i][j]=0dp[i][j]=0。
     *
     * 作者：LeetCode-Solution
     * 链接：https://leetcode-cn.com/problems/burst-balloons/solution/chuo-qi-qiu-by-leetcode-solution/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     * @param nums
     * @return
     */
    public int maxCoins(int[] nums) {
        if (nums == null || nums.length == 0){
            return 0;
        }
        int len = nums.length;
        int[] array = new int[len+2];
        array[0] = 1;
        array[len+1] = 1;
        for (int i = 1; i < len + 1; i++){
            array[i] = nums[i-1];
        }

        int[][] dp = new int[len+2][len+2];

        for (int i = len-1; i >= 0; i--){
            for (int j = i+2; j <= len+1; j++){
                // 要想求得dp[i][j]  的值，等于求解把  i-j 之前的气球轮番戳一遍即可
                for (int k = i+1; k < j; k++){
                    dp[i][j] = Math.max(dp[i][j],array[k]*array[i]*array[j] + dp[i][k] + dp[k][j]);
                }
            }
        }
        return dp[0][len+1];
    }
}