package com.xuhu.LeetCode.mid.midBefore600.mid0516;


class Solution {
    public int longestPalindromeSubseq(String s) {

        char[] chars = s.toCharArray();
        int length = chars.length;
        // 定义动态规划数组 dp i j  表示ij之间的最大回文子串长度
        int[][] dp = new int[length][length];

        for (int i = length - 1; i >= 0; i--){
            dp[i][i] = 1;
            for (int j = i+1; j < length; j++){
                if (chars[i] == chars[j]){
                    dp[i][j] = dp[i+1][j-1]+2;
                }else {
                    dp[i][j] = Math.max(dp[i+1][j],dp[i][j-1]);
                }
            }
        }
        return dp[0][length - 1];
    }
}