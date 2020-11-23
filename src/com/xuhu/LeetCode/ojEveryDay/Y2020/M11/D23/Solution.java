package com.xuhu.LeetCode.ojEveryDay.Y2020.M11.D23;


import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points.length < 1){
            return 0;
        }
        // 排序 - 根据所有节点的右端点 从小到大排序
        Arrays.sort(points, Comparator.comparingInt(x -> x[1]));
        // 选中右端点最小的一个，射出一箭
        // 移除掉已经被射爆的气球，循环
        int count = 1;
        int axis = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (axis < points[i][0]){
                count++;
                axis = points[i][1];
            }
        }
        return count;
    }
}