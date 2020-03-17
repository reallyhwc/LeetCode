package com.xuhu.LeetCode.easy.easyBefore800.easy0724;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] array = {1, 7, 3, 6, 5, 6};
        int[] array1 = {1, 2, 3};
        int[] array2 = {-1,-1,-1,1,1,1};
        System.out.println(solution.pivotIndex(array));
        System.out.println(solution.pivotIndex(array1));
        System.out.println(solution.pivotIndex(array2));
    }
}