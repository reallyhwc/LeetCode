package com.xuhu.LeetCode.easyBefore200.easy0171;

class Solution {
    public int titleToNumber(String s) {
        if(null == s || s.length() == 0){
            return 0;
        }
        int result = 0;
        for(int i = 0; i < s.length(); i++){
            result *= 26;
            result += s.charAt(i) - 'A' + 1;
        }
        return result;
    }
}