package com.xuhu.LeetCode.mid.midBefore300.mid0275;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.hIndex(new int[]{0,1,3,5,6}));
        System.out.println(solution.hIndex(new int[]{5,6,7,8,9}));
        System.out.println(solution.hIndex(new int[]{0}));
        System.out.println(solution.hIndex(new int[]{}));
    }
}