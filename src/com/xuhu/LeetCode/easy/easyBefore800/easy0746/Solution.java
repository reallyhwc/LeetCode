package com.xuhu.LeetCode.easy.easyBefore800.easy0746;


import java.util.Map;

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int f2 = 0;
        int f1 = 0;
        for(int i = cost.length - 1; i >= 0; i--){
            int f0 = cost[i] + Math.min(f1,f2);
            f2 = f1;
            f1 = f0;
        }
        return Math.min(f1,f2);
    }

}