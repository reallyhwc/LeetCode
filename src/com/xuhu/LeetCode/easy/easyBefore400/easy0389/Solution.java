package com.xuhu.LeetCode.easy.easyBefore400.easy0389;


class Solution {
    public char findTheDifference(String s, String t) {
        int[] sNums = new int[26];
        int[] tNums = new int[26];
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        for(char c : sChars){
            sNums[c-'a']++;
        }
        for(char c : tChars){
            tNums[c-'a']++;
        }
        for(int i = 0; i < 26; i++){
            if(sNums[i] < tNums[i]){
                return (char) ('a'+i);
            }
        }
        return ' ';
    }
}