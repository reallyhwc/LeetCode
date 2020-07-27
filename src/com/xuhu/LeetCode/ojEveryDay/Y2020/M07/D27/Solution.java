package com.xuhu.LeetCode.ojEveryDay.Y2020.M07.D27;


class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] chars = s.toCharArray();
        int index = -1;
        for (char c : chars){
            index = t.indexOf(c,index+1);
            if (index == -1){
                return false;
            }
        }
        return true;
    }
}