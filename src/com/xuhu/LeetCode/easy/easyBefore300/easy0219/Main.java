package com.xuhu.LeetCode.easy.easyBefore300.easy0219;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] array = {1,2,3,1};
        int[] array1 = {1,0,1,1};
        int[] array2 = {1,2,3,1,2,3};
        System.out.println(solution.containsNearbyDuplicate(array,3));
        System.out.println(solution.containsNearbyDuplicate(array1,1));
        System.out.println(solution.containsNearbyDuplicate(array2,2));
    }
}