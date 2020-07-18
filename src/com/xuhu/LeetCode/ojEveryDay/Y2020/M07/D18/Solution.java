package com.xuhu.LeetCode.ojEveryDay.Y2020.M07.D18;


class Solution {
    /**
     * dp[i][j]表示s1[0~i-1]和s2[0~j-1]能否交错组成s3[0~i+j-1]。
     * 想好边缘条件，字符串涉及子串匹配啥的统统dp完事。
     * 经典dp
     * @param s1
     * @param s2
     * @param s3
     * @return
     */
    public boolean isInterleave(String s1, String s2, String s3) {
        int l1 = s1.length();
        int l2 = s2.length();
        if ((l1 + l2) != s3.length()) {
            return false;
        }
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        char[] c3 = s3.toCharArray();
        boolean[][] dp = new boolean[l1+1][l2+1];
        dp[0][0] = true;
        for (int i = 1; i <= l1; i++){
            dp[i][0] = dp[i-1][0]&&(c1[i-1] == c3[i-1]);
        }
        for (int i = 1; i <= l2; i++){
            dp[0][i] = dp[0][i-1]&&(c2[i-1] == c3[i-1]);
        }
        for (int i = 1; i <= l1; i++){
            for (int j = 1; j <= l2; j++){
                dp[i][j] = dp[i-1][j] && c1[i-1] == c3[i-1+j] ||
                        dp[i][j-1] && c2[j-1] == c3[i-1+j];
            }
        }
        return dp[l1][l2];
    }
}