package com.xuhu.LeetCode.easy.easyBefore1000.easy977;


import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] A) {
        for(int i = 0; i < A.length; i++){
            A[i] *= A[i];
        }
        Arrays.sort(A);
        return A;
    }
}