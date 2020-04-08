package com.xuhu.LeetCode.easy.easyBefore900.easy888;


import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        long aSum = 0;
        long bSum = 0;
        Set<Integer> bSet = new HashSet<>();
        for(int a : A){
            aSum+=a;
        }
        for(int b : B){
            bSum+=b;
            bSet.add(b);
        }
        long text = (aSum-bSum)/2;

        for(int a : A){
            if(bSet.contains((int)(a-text))){
                return new int[]{a, (int) (a-text)};
            }
        }
        return new int[]{-1,-1};
    }
}