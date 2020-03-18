package com.xuhu.LeetCode.easy.easyBefore800.easy0762;


class Solution {
    public int countPrimeSetBits(int L, int R) {
        boolean[] flag = new boolean[33];
        for(int i = 2; i < 33; i++){
            if(isPrimeNum(i)){
                flag[i] = true;
            }
        }
        int ans = 0;
        for(int i = L; i<= R; i++){
            if(flag[Integer.bitCount(i)]){
                ans++;
            }
        }
        return ans;
    }

    private boolean isPrimeNum(int i){
        for(int j = i == 2 ? 3 : 2; j < Math.sqrt(i)+1; j++){
            if(i % j == 0){
                return false;
            }
        }
        return true;
    }
}