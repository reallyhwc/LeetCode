package com.xuhu.LeetCode.ojEveryDay.Y2020.M11.D27;


import java.util.HashMap;
import java.util.Map;

class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int len = A.length;
        if (len == 0){
            return 0;
        }
        Map<Integer,Integer> map = new HashMap<>(2*len);
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++){
                map.put((C[i]+D[j]),map.getOrDefault((C[i]+D[j]),0)+1);
            }
        }
        int ans = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                int target = -A[i] - B[j];
                if (map.containsKey(target)){
                    ans += map.get(target);
                }
            }
        }
        return ans;
    }
}