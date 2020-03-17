package com.xuhu.LeetCode.easy.easyBefore800.easy0709;


class Solution {
    public String toLowerCase(String str) {
        if(str == null || str.length() == 0) return str;
        char[] chars = str.toCharArray();
        for(int i = 0; i < chars.length; i++){
            char c = chars[i];
            if(c >= 'A' && c <= 'Z'){
                chars[i] -= ('A' - 'a');
            }
        }
        return new String(chars);
    }
}