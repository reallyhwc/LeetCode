package com.xuhu.LeetCode.easy0168;

class Solution {
    private int LETTER_NUM = 26;

    public String convertToTitle(int n) {
        if(n <= 0){
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (n > LETTER_NUM){
            int nowChar = n % LETTER_NUM;
            n /= LETTER_NUM;
            char c = (char) ('A' + nowChar - 1);
            stringBuilder.append(c);
        }
        char c = (char) ('A' + n - 1);
        stringBuilder.append(c);
        return stringBuilder.reverse().toString();
    }
}