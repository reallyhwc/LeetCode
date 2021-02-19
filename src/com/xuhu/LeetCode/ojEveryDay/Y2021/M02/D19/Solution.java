package com.xuhu.LeetCode.ojEveryDay.Y2021.M02.D19;


class Solution {
    public int longestOnes(int[] A, int K) {
        int nowZeroNum = 0;

        int len = A.length;
        int begin = 0;
        int end = 0;
        int max = 0;
        while (end < len) {
            end++;
            nowZeroNum += (A[end-1] == 0) ? 1 : 0;

            while (nowZeroNum > K) {
                if (A[begin] == 0){
                    nowZeroNum--;
                }
                begin++;
            }

            max = Math.max(max, end - begin);
        }

        return max;

    }
}