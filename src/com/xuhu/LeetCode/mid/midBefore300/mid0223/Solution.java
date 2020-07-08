package com.xuhu.LeetCode.mid.midBefore300.mid0223;


class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int ans = (Math.min(C,G)-Math.max(A,E)) * (Math.min(D,H) - Math.max(B,F));
        // 这里的意义就在于-》 首先计算出来两个矩形的相交面积  但是在仅仅给了两个点标明矩形的情况的时候
        // 会存在相当多的边界条件
        if (ans < 0 || G <= A || F >= D || E >= C || H <= B){
            ans = 0;
        }
        return (C-A)*(D-B) + (G-E)*(H-F) - ans;
    }
}