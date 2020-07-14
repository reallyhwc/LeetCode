package com.xuhu.LeetCode.mid.midBefore300.mid0279;


class Solution {
    public int numSquares(int n) {
        // 这边利用四平方和定理！ 任意一个有理数都能被拆分成四个数的平方和
        while (n % 4 == 0){
            n /= 4;
        }
        if (n % 8 == 7){
            return 4;
        }
        for (int i = 0; i * i < n; i++){
            int j = (int) Math.pow(n - i*i,0.5);
            if ((i*i + j * j) == n){
                if (i == 0 || j == 0){
                    return 1;
                }else {
                    return 2;
                }
            }
        }
        return 3;
    }
}