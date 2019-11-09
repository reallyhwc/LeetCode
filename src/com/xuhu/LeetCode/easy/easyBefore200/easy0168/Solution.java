package com.xuhu.LeetCode.easy.easyBefore200.easy0168;

class Solution {
    private int LETTER_NUM = 26;

    public String convertToTitle(int n) {
        if(n <= 0){
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (n > 0){
            n--;
            stringBuilder.append((char)(n % LETTER_NUM + 'A'));
            n /= LETTER_NUM;
        }
        return stringBuilder.reverse().toString();
    }
}