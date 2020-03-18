package com.xuhu.LeetCode.easy.easyBefore800.easy0766;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[][] array = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        int[][] array1 = {{1,2},{2,2}};
        int[][] array2 = {{18},{66}};
//        System.out.println(solution.isToeplitzMatrix(array));
//        System.out.println(solution.isToeplitzMatrix(array1));
        System.out.println(solution.isToeplitzMatrix(array2));
    }
}