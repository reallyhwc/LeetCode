package com.xuhu.LeetCode.ojEveryDay.Y2020.M07.D22;

import com.xuhu.LeetCode.a.util.ListUtils;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.minArray(new int[] {3,4,5,1,2}));
        System.out.println(solution.minArray(new int[] {2,2,2,0,1}));
        System.out.println(solution.minArray(new int[] {1,2,3,4,5}));
        System.out.println(solution.minArray(new int[] {2,3,4,5,1}));
        System.out.println(solution.minArray(new int[] {3,4,5,1,2}));
        System.out.println(solution.minArray(new int[] {3,3,3,1,3,3}));
        System.out.println(solution.minArray(new int[] {3,1,3}));
        System.out.println(solution.minArray(new int[] {10,1,10,10,10}));
        System.out.println(solution.minArray(new int[] {10,10,10,1,10}));
        System.out.println(solution.minArray(new int[] {10,10,10,10,10}));
        System.out.println(solution.minArray(new int[] {3,1}));
        System.out.println(solution.minArray(new int[] {3,3,1}));
//        int[] array = new int[] {3, 4, 5, 1, 2};
//        ListUtils.pringlnArrays(Arrays.copyOfRange(array,2,5));
    }
}