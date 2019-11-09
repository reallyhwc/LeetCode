package com.xuhu.LeetCode.easy.easyBefore100.easy0007;


class Solution {
    public int reverse(int x) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        //用long类型来表示转换后的数字（转换后的数字可能会超过int的存储范围）
        long rs = 0;
        //for循环与while循环意思相同，只是代码更加简洁
        //原理比较简单，看看就懂了
        for(;x != 0;rs = rs * 10 + x%10,x /= 10);
//        while (x != 0){
//            rs = rs * 10 + x%10;
//            x /= 10;
//        }
        return rs > max || rs < min ? 0 : (int)rs;
    }
}