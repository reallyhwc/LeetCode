package com.xuhu.LeetCode.mid.midBefore100.mid0031;

import com.xuhu.LeetCode.a.util.ListUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] array = {1,3,2};
        int[] array1 = {3,2,1};
        int[] array2 = {1,1,5};
        ListUtils.pringlnArrays(array);
        solution.nextPermutation(array);
        ListUtils.pringlnArrays(array);
        System.out.print("----------------------\n");
        ListUtils.pringlnArrays(array1);
        solution.nextPermutation(array1);
        ListUtils.pringlnArrays(array1);
        System.out.print("----------------------\n");
        ListUtils.pringlnArrays(array2);
        solution.nextPermutation(array2);
        ListUtils.pringlnArrays(array2);
//        int a = (((10^(3-0-1))*(1-3)) + ((10^(3-2-1))*(3-1)));
//        int a = 10^2;
//        System.out.print(a);
    }
}