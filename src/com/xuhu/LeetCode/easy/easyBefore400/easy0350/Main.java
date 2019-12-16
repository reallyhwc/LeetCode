package com.xuhu.LeetCode.easy.easyBefore400.easy0350;

import com.xuhu.LeetCode.a.util.ListUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] num1 = {1,2,2,1};
        int[] num2 = {2,2};
        int[] num3 = {4,9,5};
        int[] num4 = {9,4,9,8,4};
        ListUtils.pringlnArrays(solution.intersect(num1,num2));
        ListUtils.pringlnArrays(solution.intersect(num3,num4));
    }
}