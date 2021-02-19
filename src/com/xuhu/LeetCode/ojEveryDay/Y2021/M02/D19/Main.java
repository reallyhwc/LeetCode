package com.xuhu.LeetCode.ojEveryDay.Y2021.M02.D19;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0},3));
        System.out.println(solution.longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0},2));
        System.out.println(solution.longestOnes(new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1},3));
    }
}