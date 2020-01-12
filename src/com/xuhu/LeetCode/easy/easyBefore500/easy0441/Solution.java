package com.xuhu.LeetCode.easy.easyBefore500.easy0441;

class Solution {
    public int arrangeCoins(int n) {
        return (int)(Math.sqrt(2) * Math.sqrt(n + 0.125) - 0.5);
    }
}