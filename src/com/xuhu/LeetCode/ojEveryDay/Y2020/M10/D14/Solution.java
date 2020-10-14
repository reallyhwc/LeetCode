package com.xuhu.LeetCode.ojEveryDay.Y2020.M10.D14;


import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> commonChars(String[] A) {
        int len = A.length;
        int[][] charNums = new int[A.length][26];
        for (int i = 0; i < A.length; i++) {
            char[] chars = A[i].toCharArray();
            for (char c : chars){
                charNums[i][c-'a']++;
            }
        }
        List<String> ans = new ArrayList<String>();
        for(int x = 0; x < 26; x++){
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < len; i++){
                min = Math.min(min,charNums[i][x]);
            }
            for (int i = 0; i < min; i++){
                ans.add(String.valueOf((char)('a' + x)));
            }
        }
        return ans;
    }
}