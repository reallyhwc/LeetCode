package com.xuhu.LeetCode.easy.easyBefore400.easy0392;


class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] sChars = s.toCharArray();
        int index = -1;
        for(char c : sChars){
            index = t.indexOf(c,index + 1);
            if(index == -1){
                return false;
            }
        }
        return true;
    }
}