package com.xuhu.LeetCode.easy.easyBefore700.easy680;


class Solution {
    public boolean validPalindrome(String s) {
        if(s == null || s.length() <= 1){
            return true;
        }
        int count = 0;

        int i = 0;
        int j = s.length() - 1;
        while (i < j && count <= 1){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
                continue;
            }else {
                return isValid(s,i+1,j) || isValid(s,i,j-1);
            }

        }
        return count<=1;
    }

    private boolean isValid(String s, int i, int j){
        if(s == null || s.length() <= 1){
            return true;
        }
        while (i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}