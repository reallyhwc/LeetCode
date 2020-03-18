package com.xuhu.LeetCode.easy.easyBefore800.easy0744;


class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for (char c: letters)
            if (c > target) return c;
        return letters[0];
    }
}