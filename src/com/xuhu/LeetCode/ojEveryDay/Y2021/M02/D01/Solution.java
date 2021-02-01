package com.xuhu.LeetCode.ojEveryDay.Y2021.M02.D01;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        Set<Integer> bSet = new HashSet<>();
        int aSum = 0;
        int bSum = 0;
        for (int item : A) {
            aSum += item;
        }
        for (int value : B) {
            bSum += value;
            bSet.add(value);
        }
        int target = (aSum - bSum) / 2;

        for (int num : A){
            if (bSet.contains(num - target)){
                return new int[]{num, num - target};
            }
        }
        return new int[] {-1,-1};
    }
}