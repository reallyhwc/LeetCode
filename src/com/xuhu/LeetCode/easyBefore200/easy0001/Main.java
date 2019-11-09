package com.xuhu.LeetCode.easyBefore200.easy0001;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] nums = {3,2,4};
        int target = 6;
        for(int X : solution.twoSum(nums,target)){
            System.out.println(X);
        }
    }
}