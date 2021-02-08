package com.xuhu.LeetCode.ojEveryDay.Y2021.M02.D06;


class Solution {
    // 伪DP 考虑使用滑动窗口，从全左到全右侧即可
    public int maxScore(int[] cardPoints, int k) {
        int len = cardPoints.length;
        int left = k;
        int right = 0;
        int nowSum = 0;
        int max = 0;
        for (int i = 0; i < k; i++){
            nowSum += cardPoints[i];
        }
        if (k == len){
            return nowSum;
        }
        max = nowSum;
        while (right < k){
            nowSum -= cardPoints[--left];
            nowSum += cardPoints[len - right - 1];
            right++;

            max = Math.max(max, nowSum);
        }

        return max;
    }
}