package com.xuhu.LeetCode.easy.easyBefore200.easy0122;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] array = {7,1,5,3,6,4};
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {7,6,4,3,1};
        System.out.println(solution.maxProfit(array));
        System.out.println(solution.maxProfit(array1));
        System.out.println(solution.maxProfit(array2));
    }
}