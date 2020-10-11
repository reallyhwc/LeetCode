package com.xuhu.LeetCode.game.week.W2020_10_11.T03;


class Solution {
    public boolean checkPalindromeFormation(String a, String b) {
        if(a == null || b == null){
            return true;
        }
        if (a.length() != b.length()){
            return false;
        }
        if (a.length() == 1){
            return true;
        }

        return false;
    }
}