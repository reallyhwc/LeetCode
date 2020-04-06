package com.xuhu.LeetCode.easy.easyBefore900.easy860;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] array = {5,5,5,10,20};
        int[] array1 = {5,5,5};
        int[] array2 = {10,10};
        int[] array3 = {5,5,10,10,20};
        System.out.println(solution.lemonadeChange(array));
        System.out.println(solution.lemonadeChange(array1));
        System.out.println(solution.lemonadeChange(array2));
        System.out.println(solution.lemonadeChange(array3));
    }
}