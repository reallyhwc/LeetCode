package com.xuhu.LeetCode.easy.easyBefore1000.easy961;

class Solution {
    public int repeatedNTimes(int[] A) {
        boolean[] booleans = new boolean[10001];
        for(int x : A){
            if(!booleans[x]){
                booleans[x] = true;
            }else {
                return x;
            }
        }
        return -1;
    }
}