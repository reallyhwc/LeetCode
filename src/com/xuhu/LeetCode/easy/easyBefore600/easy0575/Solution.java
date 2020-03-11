package com.xuhu.LeetCode.easy.easyBefore600.easy0575;


import java.util.HashSet;
import java.util.Set;

class Solution {
    public int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<>();
        for(int X : candies){
            set.add(X);
        }
        return Math.min(candies.length / 2, set.size());
    }
}