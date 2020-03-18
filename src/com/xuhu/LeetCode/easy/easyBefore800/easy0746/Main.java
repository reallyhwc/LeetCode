package com.xuhu.LeetCode.easy.easyBefore800.easy0746;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] array = {10,15,20};
        int[] array1 = {1,100,1,1,1,100,1,1,100,1};
        System.out.println(solution.minCostClimbingStairs(array));
        System.out.println(solution.minCostClimbingStairs(array1));
    }
}