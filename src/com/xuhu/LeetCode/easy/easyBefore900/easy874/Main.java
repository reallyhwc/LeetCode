package com.xuhu.LeetCode.easy.easyBefore900.easy874;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] commads = {4,-1,3};
        int[] commads1 = {4,-1,4,-2,4};
        int[][] arrays = {};
        int[][] arrays1 = {{2,4}};
        System.out.println(solution.robotSim(commads,arrays));
        System.out.println(solution.robotSim(commads1,arrays1));
    }
}