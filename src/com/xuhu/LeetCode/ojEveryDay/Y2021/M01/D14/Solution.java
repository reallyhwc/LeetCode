package com.xuhu.LeetCode.ojEveryDay.Y2021.M01.D14;


import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> list = new ArrayList<>();
        int num = 0;
        for (int i = 0; i < A.length; i++) {
            num = ((num << 1) + A[i]) % 5;
            list.add(num == 0);
        }
        return list;
    }
}