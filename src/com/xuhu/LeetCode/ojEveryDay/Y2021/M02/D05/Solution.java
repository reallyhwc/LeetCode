package com.xuhu.LeetCode.ojEveryDay.Y2021.M02.D05;


class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
         int len = s.length();
         char[] charsS = s.toCharArray();
         char[] charsT = t.toCharArray();
         int[] numArray = new int[len];
         for (int i = 0; i < len; i++) {
             numArray[i] = Math.abs(charsS[i] - charsT[i]);
         }
         int max = 0;
         int begin = 0;
         int end = 0;
         int nowSum = 0;
         while (end < len){
             nowSum += numArray[end++];
             while (nowSum > maxCost){
                 nowSum -= numArray[begin++];
             }
             max = Math.max(max, end - begin);
         }

         return max;
    }
}