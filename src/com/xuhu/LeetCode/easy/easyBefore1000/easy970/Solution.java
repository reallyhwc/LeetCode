package com.xuhu.LeetCode.easy.easyBefore1000.easy970;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        List<Integer> ans = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        int xSum = 1;

        while (xSum < bound){
            int ySum = 1;
            while ((xSum + ySum) <= bound){
                if(!set.contains(xSum + ySum)){
                    ans.add(xSum + ySum);
                    set.add(xSum + ySum);
                }
                ySum *= y;
                if(y == 1)break;
            }
            xSum *= x;
            if(x == 1) break;
        }

        return ans;
    }
}