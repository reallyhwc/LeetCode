package com.xuhu.LeetCode.easy.easyBefore1000.easy922;


class Solution {
    public int[] sortArrayByParityII(int[] A) {
        //偶下标
        int i = 0;
        //奇下标
        int j = 1;
        for(; i < A.length - 1; i+=2){
            if((A[i]&1)!=0){
                while ((A[j]&1) != 0){
                    j+=2;
                }
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        return A;
    }
}