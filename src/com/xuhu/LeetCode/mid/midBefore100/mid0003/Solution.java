package com.xuhu.LeetCode.mid.midBefore100.mid0003;


class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        int[] index = new int[128];
        for(int j = 0,i = 0; j < n; j++){
            i = Math.max(index[s.charAt(j)],i);
            ans = Math.max(ans,j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
    }
}