package com.xuhu.LeetCode.mid.midBefore100.mid0008;


class Solution {
    public int myAtoi(String str) {
        char[] chars = str.toCharArray();
        int ans = 0;
        boolean isFuShu = false;
        int index = 0;
        //首先去掉前导空格
        int N = chars.length;
        while (index < N && chars[index] == ' '){
            index++;
        }
        if(index == N){
            return 0;
        }

        if(chars[index] == '-'){
            isFuShu = true;
            index++;
        }else if(chars[index] == '+'){
            index++;
        }else if(!Character.isDigit(chars[index])){
            return 0;
        }
        while (index < N && Character.isDigit(chars[index])){
            int now = chars[index] - '0';
            if(ans > (Integer.MAX_VALUE - now) / 10){
                return isFuShu ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            ans = ans * 10 + now;
            index++;
        }

        return isFuShu ? -ans : ans;
    }
}