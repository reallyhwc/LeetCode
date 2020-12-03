package com.xuhu.LeetCode.ojEveryDay.Y2020.M12.D03;


import java.util.Arrays;

class Solution {
    public int countPrimes(int n) {
        boolean[] flag = new boolean[n];
        Arrays.fill(flag, true);
        for (int i = 2; i * i < n; i++) {
            if (flag[i]){
                for (int j = i*i; j < n; j+=i) {
                    flag[j] = false;
                }
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++){
            if (flag[i]) {
                count++;
            }
        }
        return count;
    }
}