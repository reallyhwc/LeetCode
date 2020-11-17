package com.xuhu.LeetCode.ojEveryDay.Y2020.M11.D17;


import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] ans = new int[R*C][2];
        int index = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                int[] temp = {i,j};
                ans[index++] = temp;
            }
        }
        Arrays.sort(ans, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                int dis1 = Math.abs(o1[0] - r0) + Math.abs(o1[1] - c0);
                int dis2 = Math.abs(o2[0] - r0) + Math.abs(o2[1] - c0);
                return dis1 - dis2;
            }
        });

        return ans;
    }
}