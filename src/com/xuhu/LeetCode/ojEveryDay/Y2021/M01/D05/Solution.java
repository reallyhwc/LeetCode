package com.xuhu.LeetCode.ojEveryDay.Y2021.M01.D05;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> ansList = new ArrayList<>();
        if (s == null || s.length() <= 2) {
            return ansList;
        }
        char[] chars = s.toCharArray();
        char lastChar = chars[0];
        int num = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == lastChar) {
                num++;
            } else {
                if (num >= 3) {
                    ansList.add(Arrays.asList(i - num, i - 1));
                }
                num = 1;
                lastChar = chars[i];
            }
        }
        if (num >= 3) {
            ansList.add(Arrays.asList(s.length() - num, s.length() - 1));
        }
        return ansList;
    }
}