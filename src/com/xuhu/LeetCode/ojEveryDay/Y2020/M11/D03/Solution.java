package com.xuhu.LeetCode.ojEveryDay.Y2020.M11.D03;


class Solution {
    public boolean validMountainArray(int[] A) {
        int i = 1;
        while (i < A.length && A[i] > A[i-1]){
            i++;
        }
        if(i == 1 || i == A.length){
            return false;
        }

        while (i < A.length && A[i] < A[i-1]){
            i++;
        }
        return i == A.length;
    }
}