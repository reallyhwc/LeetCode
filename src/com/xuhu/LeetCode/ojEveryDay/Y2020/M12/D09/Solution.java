package com.xuhu.LeetCode.ojEveryDay.Y2020.M12.D09;


import java.util.Arrays;

class Solution {
    public int uniquePaths(int m, int n) {
        if (m == 1 || n == 1){
            return 1;
        }
        int[] array = new int[n];
        Arrays.fill(array,1);
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                array[j] += array[j-1];
            }
        }
        return array[n-1];
    }
}