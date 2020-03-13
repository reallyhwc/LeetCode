package com.xuhu.LeetCode.easy.easyBefore700.easy674;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] array = {1,3,5,4,7};
        int[] array1 = {2,2,2,2,2};
        int[] array2 = {1,3,5,7};
        int[] array3 = {1,3,5,4,2,3,4,5};
        System.out.println(solution.findLengthOfLCIS(array));
        System.out.println(solution.findLengthOfLCIS(array1));
        System.out.println(solution.findLengthOfLCIS(array2));
        System.out.println(solution.findLengthOfLCIS(array3));
    }
}