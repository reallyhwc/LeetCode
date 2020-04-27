package com.xuhu.LeetCode.mid.midBefore100.mid0091;


class Solution {

    public int numDecodings(String s) {
        if(null == s || s.length() == 0 || s.charAt(0) == '0') return 0;
        int[] dp = new int[s.length()+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i < dp.length; i++){
            int preNum = s.charAt(i-2)-'0';
            int curNum = s.charAt(i-1)-'0';
            int tarNum = preNum * 10 + curNum;
            if(curNum == 0 && (preNum < 1 || preNum > 2)){
                return 0;
            }

            if(curNum == 0 && (preNum == 1 || preNum == 2)){
                dp[i] = dp[i-2];
            }else if(tarNum > 10 && tarNum <= 26){
                dp[i] = dp[i-1] + dp[i-2];
            }else {
                dp[i] = dp[i-1];
            }

        }
        return dp[s.length()];
    }

    public int numDecodings1(String s) {
        int len = s.length();
        if(len == 0 || (len == 1  && s.charAt(0) == '0')) return 0;
        int[] dp = new int[2];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 0 ;i < len; i++){
            char c = s.charAt(i);
            int temp = 0;
            if(c != '0') temp += dp[1];
            if(i > 0){
                char beforeC = s.charAt(i-1);
                if(beforeC == '1' || (beforeC == '2' && c <= '6')){
                    temp += dp[0];
                }
            }
            dp[0] = dp[1];
            dp[1] = temp;

        }
        return dp[1];
    }
}