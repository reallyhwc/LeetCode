package com.xuhu.LeetCode.easy.easyBefore300.easy0217;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] array = {1,2,3,1};
        int[] array1 = {1,2,3,4};
        int[] array2 = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(solution.containsDuplicate(array));
        System.out.println(solution.containsDuplicate(array1));
        System.out.println(solution.containsDuplicate(array2));
    }
}