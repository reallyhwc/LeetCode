package com.xuhu.LeetCode.easy.easyBefore500.easy0475;


import java.util.Arrays;

class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int hIndex = 0;
        int ans = 0;

        for(int house : houses){
            while (hIndex < heaters.length - 1 && (heaters[hIndex] + heaters[hIndex + 1] < 2 * house)){
                hIndex++;
            }
            ans = Math.max(ans,Math.abs(heaters[hIndex] - house));
        }
        return ans;
    }
}