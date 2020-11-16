package com.xuhu.LeetCode.ojEveryDay.Y2020.M11.D16;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,(a,b)->a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);
        List<int[]> list = new LinkedList<>();
        for (int [] p : people){
            list.add(p[1],p);
        }
        return list.toArray(new int[list.size()][]);
    }
}