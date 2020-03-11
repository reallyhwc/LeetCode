package com.xuhu.LeetCode.easy.easyBefore600.easy0581;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] array = {2, 6, 4, 8, 10, 9, 15};
        int[] array1 = {1,2,3,4};
        int[] array2 = {1,2,3,4};
        System.out.println(solution.findUnsortedSubarray(array));
        System.out.println(solution.findUnsortedSubarray(array1));
        System.out.println(solution.findUnsortedSubarray(array2));
    }
}