package com.xuhu.LeetCode.easy.easyBefore400.easy0383;


class Solution {
    public boolean canConstruct1(String ransomNote, String magazine) {
        int[] a = new int[26];
        int[] b = new int[26];
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            a[c - 'a']++;
        }
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            b[c - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (a[i] > b[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] nums = new int[26];
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            nums[c - 'a']++;
        }

        int len = ransomNote.length();
        for (int i = 0; i < magazine.length() && len > 0; i++) {
            char c = magazine.charAt(i);
            if (nums[c - 'a'] != 0) {
                nums[c - 'a']--;
                len--;
            }
        }
        return len == 0;
    }
}