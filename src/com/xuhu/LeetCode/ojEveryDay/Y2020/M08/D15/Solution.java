package com.xuhu.LeetCode.ojEveryDay.Y2020.M08.D15;


class Solution {
    /**
     * 这个题目没有思路 参看官方题解
     *
     * @param boxes
     * @return
     */
    public int removeBoxes(int[] boxes) {
        int[][][] dp = new int[100][100][100];
        return calculatePoints(boxes,dp,0,boxes.length-1,0);
    }

    private int calculatePoints(int[] boxes, int[][][] dp, int l, int r, int k){
        if (l > r){
            return 0;
        }
        if (dp[l][r][k] != 0){
            return dp[l][r][k];
        }
        while (r > l && boxes[r] == boxes[r-1]){
            r--;
            k++;
        }
        dp[l][r][k] = calculatePoints(boxes,dp,l,r-1,0) + (k+1) * (k+1);
        for (int i = 1; i < r; i++){
            if (boxes[i] == boxes[r]){
                dp[l][r][k] = Math.max(dp[l][r][k],
                        calculatePoints(boxes,dp,l,i,k+1) + calculatePoints(boxes,dp,i+1,r-1,0));
            }
        }
        return dp[l][r][k];
    }
}