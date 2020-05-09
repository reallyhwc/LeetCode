package com.xuhu.LeetCode.mid.midBefore200.mid0120;


import java.util.List;

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int N = triangle.size();
        int[] min = new int[N+1];
        for(int i = N-1; i >= 0; i--){
            for(int j = 0; j <= i; j++){
                min[j] = Math.min(min[j],min[j+1]) + triangle.get(i).get(j);
            }
        }
        return min[0];
    }

    // 原地算法
    public int minimumTotal1(List<List<Integer>> triangle) {
        int N = triangle.size();
        for(int i = N-2; i >= 0; i--){
            for(int j = 0; j <= i; j++){
                triangle.get(i).set(j,triangle.get(i).get(j)+Math.min(triangle.get(i+1).get(j),triangle.get(i+1).get(j+1)));
            }
        }
        return triangle.get(0).get(0);
    }
}