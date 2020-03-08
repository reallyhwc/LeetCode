package com.xuhu.LeetCode.easy.easyBefore600.easy0520;


class Solution {
    public boolean detectCapitalUse(String word) {
        if(null == word || word.length() <= 1){
            return true;
        }
        char c = word.charAt(0);
        boolean isBIG = true;
        if(c <= 'z' && c >= 'a'){
            isBIG = false;
        }
        c = word.charAt(1);
        if(c <= 'Z' && c >= 'A'){
            if ( !isBIG){
                return false;
            }
        }else {
            if(c <= 'z' && c >= 'a'){
                isBIG = false;
            }
        }
        for(int i = 2; i < word.length(); i++){
            char c1 = word.charAt(i);
            boolean tempIsBIG = (c1 >= 'A' && c1 <= 'Z');
            if(tempIsBIG != isBIG){
                return false;
            }
        }

        return true;
    }
}