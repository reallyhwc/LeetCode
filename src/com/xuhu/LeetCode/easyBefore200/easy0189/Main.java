package com.xuhu.LeetCode.easyBefore200.easy0189;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] array = {1,2,3,4,5,6,7};
        solution.rotate(array,3);
        for(int X : array){
            System.out.print(X + "\t");
        }

    }
}