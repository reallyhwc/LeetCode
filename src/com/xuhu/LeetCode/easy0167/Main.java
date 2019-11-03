package com.xuhu.LeetCode.easy0167;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] arrays = {2, 7, 11, 15};
        int[] array = solution.twoSum(arrays,9);
        System.out.println(array[0]);
        System.out.println(array[1]);
    }
}