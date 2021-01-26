package com.xuhu.LeetCode.ojEveryDay.Y2021.M01.D26;


import java.util.Arrays;

class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int ans = 0;
        // 1 <= dominoes[i][j] <= 9 所以 最大为100
        int[] array = new int[100];
        for (int[] domain : dominoes){
            Arrays.sort(domain);
            ans += array[domain[0] * 10 + domain[1]]++;
        }
        return ans;
    }
}