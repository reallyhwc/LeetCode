package com.xuhu.LeetCode.easy.easyBefore600.easy0557;


class Solution {
    public String reverseWords(String s) {
        int lastBlackSpaceIndex = -1;
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length; i++){
            char c = chars[i];
            if(c == ' '){
                method(chars,lastBlackSpaceIndex + 1, i - 1);
                lastBlackSpaceIndex = i;
            }
        }
        method(chars,lastBlackSpaceIndex + 1, chars.length - 1);
        return  new String(chars);
    }

    private void method(char[] chars, int begin, int end){
        if(begin < 0 || end >= chars.length || begin > end){
            return;
        }
        while (begin < end){
            char c = chars[end];
            chars[end--] = chars[begin];
            chars[begin++] = c;
        }
    }
}