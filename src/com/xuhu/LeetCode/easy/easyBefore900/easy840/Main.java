package com.xuhu.LeetCode.easy.easyBefore900.easy840;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[][] array = {{4,3,8,4},{9,5,1,9},{2,7,6,2}};
        int[][] array1 = {{2,7,6},{1,5,9},{4,3,8}};
        int[][] array2 = {{5,5,5},{5,5,5},{5,5,5}};
        System.out.println(solution.numMagicSquaresInside(array));
        System.out.println(solution.numMagicSquaresInside(array1));
        System.out.println(solution.numMagicSquaresInside(array2));
    }
}