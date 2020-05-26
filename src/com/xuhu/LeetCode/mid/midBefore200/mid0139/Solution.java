package com.xuhu.LeetCode.mid.midBefore200.mid0139;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        Set<String> set = new HashSet<>();
        set.addAll(wordDict);

        boolean[] memo = new boolean[n+1];
        memo[0] = true;
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < i; j++){
                if(memo[j] && set.contains(s.substring(j,i))){
                    memo[i] = true;
                    break;
                }
            }
        }
        return memo[n];
    }

}