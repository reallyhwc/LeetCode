package com.xuhu.LeetCode.ojEveryDay.Y2020.M10.D16;


class Solution {
    public int[] sortedSquares(int[] A) {
        int len = A.length;
        int[] ans = new int[len];
        int i = 0;
        int j = len - 1;

        int targetIndex = 0;

        while (i <= j){
            if (Math.abs(A[i]) >= Math.abs(A[j])){
                ans[len - targetIndex - 1] = A[i] * A[i];
                i++;
            }else {
                ans[len - targetIndex - 1] = A[j] * A[j];
                j--;
            }
            targetIndex++;
        }
        return ans;
    }
}