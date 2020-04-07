package com.xuhu.LeetCode.easy.easyBefore1000.easy914;


class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        int[] count = new int[10000];
        for(int x: deck){
            count[x]++;
        }
        int x = 0;
        for(int cot : count){
            if(cot > 0){
                x = gcd(x,cot);
                if(x == 1){
                    return false;
                }
            }
        }
        return x >= 2;
    }

    private int gcd(int a, int b){
        return b == 0 ? a : gcd(b,a%b);
    }
}