package com.xuhu.LeetCode.easy02.easyBefore100.easy009;


class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        int a = x;
        int rs = 0;
        while (x > 0){
            rs = rs * 10 + x % 10;
            x = x / 10;
        }
        return a == rs;
    }
}