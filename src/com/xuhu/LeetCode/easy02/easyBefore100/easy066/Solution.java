package com.xuhu.LeetCode.easy02.easyBefore100.easy066;


class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        for (int i = 1; i < digits.length; i++) {
            digits[i] = 0;
        }
        return digits;
    }
}