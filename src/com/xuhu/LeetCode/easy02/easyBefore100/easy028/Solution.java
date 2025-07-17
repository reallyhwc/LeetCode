package com.xuhu.LeetCode.easy02.easyBefore100.easy028;

class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) {
            return -1;
        }
        if (haystack.length() < needle.length()) {
            return -1;
        }

        int start = 0;
        int end = 0;
        while (start <= (haystack.length() - needle.length()) && end < needle.length()) {
            if (needle.charAt(end) == haystack.charAt(start + end)) {
                end++;
            } else {
                start++;
                end = 0;
            }
        }
        if (end == (needle.length())) {
            return start;
        } else {
            return -1;
        }
    }
}