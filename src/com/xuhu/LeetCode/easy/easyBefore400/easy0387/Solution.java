package com.xuhu.LeetCode.easy.easyBefore400.easy0387;


class Solution {
    public int firstUniqChar(String s) {
        if(null == s || s.length() == 0){
            return -1;
        }
        if(s.length() == 1){
            return 0;
        }
        char[] chars = s.toCharArray();
        int[] nums = new int[256];
        for(char c : chars){
            nums[c]++;
        }
        for(int i = 0; i < chars.length; i++){
            if(nums[chars[i]] == 1){
                return i;
            }
        }
        return -1;
    }
}