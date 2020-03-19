package com.xuhu.LeetCode.easy.easyBefore800.easy0796;


class Solution {
    public boolean rotateString(String A, String B) {
        if(A == null && B == null) return true;
        if(A == null || B == null) return false;
        if(A.length() != B.length()){
            return false;
        }
        String str = A + A;
        return str.indexOf(B) >= 0;
    }
}