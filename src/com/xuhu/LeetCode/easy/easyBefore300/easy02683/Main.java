package com.xuhu.LeetCode.easy.easyBefore300.easy02683;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] array = {0,1,0,3,12};
        solution.moveZeroes(array);
        for(int X : array){
            System.out.println(X);
        }
        System.out.println();
    }
}