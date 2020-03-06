package com.xuhu.LeetCode.easy.easyBefore600.easy0504;


class Solution {
    public String convertToBase7(int num) {
        if(num == 0){
            return "0";
        }
        StringBuilder stringBuilder = new StringBuilder();
        int n = Math.abs(num);
        while (n > 0){
            stringBuilder.append(n % 7);
            n /= 7;
        }
        if(num < 0){
            stringBuilder.append("-");
        }
        return stringBuilder.reverse().toString();
    }
}