package com.xuhu.LeetCode.easy.easyBefore300.easy0205;


class Solution {
    public boolean isIsomorphic(String s, String t) {
        int length = s.length();
        for(int i = 0 ;i < length; i++){
            if(s.indexOf(s.charAt(i)) != (t.indexOf(t.charAt(i)))){
                return false;
            }
        }
        return true;
    }
}