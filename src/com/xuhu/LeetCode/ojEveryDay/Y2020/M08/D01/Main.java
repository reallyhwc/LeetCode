package com.xuhu.LeetCode.ojEveryDay.Y2020.M08.D01;

import com.xuhu.LeetCode.a.util.ListUtils;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.smallestRange(ListUtils.createDoubleListByDoubleArray(new Integer[][]{{4, 10, 15, 24, 26}, {0, 9, 12, 20}, {5, 18, 22, 30}}))));
    }
}