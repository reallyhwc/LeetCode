package com.xuhu.LeetCode.easy.easyBefore500.easy0461;

class Solution {
    public int hammingDistance(int x, int y) {
        int xAndY = x^y;
        int count = 0;
        while (xAndY != 0){
            count += xAndY & 1;
            xAndY = xAndY >> 1;
        }
        return count;
    }
}