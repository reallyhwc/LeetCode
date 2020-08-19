package com.xuhu.LeetCode.ojEveryDay.Y2020.M08.D19;


class Solution {
    private int num;
    private int length;
    public int countSubstrings(String s) {
        if (s == null || s.length() == 0){
            return 0;
        }
        length = s.length();
        num = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < length; i++) {
            count(chars,i,i);//回文串长度为奇数
            count(chars,i,i+1);//回文串长度为偶数
        }
        return num;
    }

    private void count(char[] chars,int start, int end){
        while (start >= 0 && end < length && chars[start] == chars[end]){
            num++;
            start--;
            end++;
        }
    }
}