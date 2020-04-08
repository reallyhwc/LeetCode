package com.xuhu.LeetCode.easy.easyBefore1000.easy917;


class Solution {
    public String reverseOnlyLetters(String S) {
        if(null == S || S.length() <= 1){
            return S;
        }
        char[] chars = S.toCharArray();

        int i = 0;
        int j = chars.length-1;

        while (i < j){
            if(isZIMU(chars[i]) && isZIMU(chars[j])){
                char c = chars[i];
                chars[i] = chars[j];
                chars[j] = c;
                i++;
                j--;
                continue;
            }
            if(!isZIMU(chars[i])){
                i++;
            }
            if(!isZIMU(chars[j])){
                j--;
            }
        }

        return new String(chars);
    }

    private boolean isZIMU(char c){
        if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
            return true;
        }
        return false;
    }
}