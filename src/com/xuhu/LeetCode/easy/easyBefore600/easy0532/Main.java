package com.xuhu.LeetCode.easy.easyBefore600.easy0532;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] array = {3, 1, 4, 1, 5};
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 3, 1, 5, 4};
        System.out.println(solution.findPairs(array,2));
        System.out.println(solution.findPairs(array1,1));
        System.out.println(solution.findPairs(array2,0));
    }
}