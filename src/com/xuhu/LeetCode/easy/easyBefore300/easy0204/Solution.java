package com.xuhu.LeetCode.easy.easyBefore300.easy0204;


import java.lang.reflect.Array;
import java.util.Arrays;

class Solution {
    public int countPrimes(int n) {
        boolean[] isPrim = new boolean[n];
        Arrays.fill(isPrim,true);

        for(int i = 2; i*i < n; i++ ){
            if(isPrim[i]){
                for(int j = i * i; j < n; j += i){
                    isPrim[j] = false;
                }
            }
        }
        int count = 0;
        for(int i = 2; i < n; i++){
            if(isPrim[i]){
                count++;
            }
        }

        return count;

    }
}