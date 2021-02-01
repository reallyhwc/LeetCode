package com.xuhu.LeetCode.ojEveryDay.Y2021.M02.D01;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.fairCandySwap(new int[]{1, 1}, new int[]{2, 2})));
        System.out.println(Arrays.toString(solution.fairCandySwap(new int[]{1, 2, 5}, new int[]{2, 4})));
    }
}