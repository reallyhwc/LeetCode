package com.xuhu.LeetCode.ojEveryDay.Y2020.M07.D14;


import java.util.List;

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int N = triangle.size();
        for (int i = N-2; i >= 0; i--){
            for (int j = 0; j <= i; j++){
                triangle.get(i).set(j, triangle.get(i).get(j) + Math.min(triangle.get(i+1).get(j), triangle.get(i+1).get(j+1)));
            }
        }
        return triangle.get(0).get(0);
    }
}