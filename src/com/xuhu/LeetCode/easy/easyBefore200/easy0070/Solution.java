package com.xuhu.LeetCode.easy.easyBefore200.easy0070;


class Solution {
    public int climbStairs(int n) {
        //经典的爬楼梯问题
        //假设爬楼梯 第几层楼梯爬的次数符合函数 f(X)
        //那么在到达终点前，有两种可能 1.从X-1级台阶跳一步上来 2.从X-2级台阶上跳两步上来
        //归纳可得出 f(x) = f(X-1) + f(X-2);
        //同时，如果直接用递归做的话，时间复杂度会爆炸，通过循环优化一下（类似斐波契纳数列）
        int a1 = 1;
        int a2 = 2;
        if(n == 1){
            return a1;
        }
        if(n == 2){
            return a2;
        }
        while(n > 2){
            int temp = a1 + a2;
            a1 = a2;
            a2 = temp;
            n--;
        }
        return a2;
    }
}