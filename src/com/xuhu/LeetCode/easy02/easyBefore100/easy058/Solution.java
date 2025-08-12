package com.xuhu.LeetCode.easy02.easyBefore100.easy058;


class Solution {
    public int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        int length = chars.length;
        int end = length - 1;
        while (end >= 0 && chars[end] == ' ') {
            end--;
        }
        int start = end;
        while (start >= 0 && chars[start] != ' ') {
            start--;
        }

        return end - start + 1;
    }
}