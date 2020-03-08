package com.xuhu.LeetCode.easy.easyBefore600.easy0509;


class Solution {
    public int fib(int N) {
        if(N <= 0){
            return 0;
        }
        if(N == 1){
            return 1;
        }
        if(N == 2){
            return 1;
        }
        int a1 = 1;
        int a2 = 1;
        for(int i = 2; i < N ; i++){
            int num = a1 + a2;
            a1 = a2;
            a2 = num;
        }
        return a2;
    }
}