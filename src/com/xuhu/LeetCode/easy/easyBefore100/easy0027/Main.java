package com.xuhu.LeetCode.easy.easyBefore100.easy0027;

public class Main {
    public static void main(String[] args){
        int[] nums = {0,1,2,2,3,0,4,2};
        Solution solution = new Solution();
        System.out.println(solution.removeElement(nums,2));
        System.out.println();
        for(int X : nums){
            System.out.println(X);
        }
    }
}