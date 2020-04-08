package com.xuhu.LeetCode.easy.easyBefore1000.easy908;


class Solution {
    public int smallestRangeI(int[] A, int K) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int x : A){
            max = Math.max(max,x);
            min = Math.min(min,x);
        }

        return (max - min) <= 2*K ? 0 : (max-min - 2*K);
    }
}