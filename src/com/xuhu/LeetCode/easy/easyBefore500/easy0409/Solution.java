package com.xuhu.LeetCode.easy.easyBefore500.easy0409;

class Solution {
    public int longestPalindrome(String s) {
        int[] nums = new int[128];
        for(char c : s.toCharArray()){
            nums[c]++;
        }
        int result = 0;
        for(int num : nums){
            result += (num / 2) * 2;
            if(num % 2 == 1 && result % 2 == 0){
                result++;
            }
        }
        return result;
    }
}