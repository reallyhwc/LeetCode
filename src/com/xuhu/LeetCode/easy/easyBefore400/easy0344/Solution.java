package com.xuhu.LeetCode.easy.easyBefore400.easy0344;


class Solution {
    public void reverseString2(char[] s) {
        if(s == null || s.length <= 1){
            return;
        }
        int begin = 0;
        int end = s.length - 1;
        while (begin < end){
            char temp = s[begin];
            s[begin] = s[end];
            s[end] = temp;
            begin++;
            end--;
        }
    }

    public void reverseString(char[] s) {
        if (s.length == 0)
            return ;
        for(int i=0; i<s.length/2;i++) {
            char a = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = a;
        }
    }
}