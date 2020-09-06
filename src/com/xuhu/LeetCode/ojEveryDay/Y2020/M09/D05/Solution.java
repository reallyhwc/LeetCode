package com.xuhu.LeetCode.ojEveryDay.Y2020.M09.D05;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 逆康托展开
 *
 * 康托展开是一个全排列到一个自然数的双射，常用于构建hash表时的空间压缩。
 * 设有n个数（1，2，3，4,…,n），可以有组成不同(n!种)的排列组合，
 * 康托展开表示的就是是当前排列组合在n个不同元素的全排列中的名次。
 */
class Solution {
    public String getPermutation(int n, int k) {
        int[] digit = {0,1,2,3,4,5,6,7,8,9};
        List<Integer> digitList = Arrays.stream(digit).boxed().collect(Collectors.toList());
        int[] factor = {1,1,2,6,24,120,720,5040,40320,362880};
        StringBuilder sb = new StringBuilder();
        k--;
        while (n > 0){
            int val = k / factor[n-1];
            sb.append(digitList.get(val+1));
            digitList.remove(val+1);
            k = k % factor[n-1];
            n--;
        }
        return sb.toString();
    }
}