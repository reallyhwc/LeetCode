package com.xuhu.LeetCode.easy.easyBefore800.easy0771;


import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numJewelsInStones(String J, String S) {
        char[] chars = J.toCharArray();
        Set<Character> set = new HashSet<>();
        for(char c : chars){
            set.add(c);
        }
        int ans = 0;

        char[] chars1 = S.toCharArray();
        for(char c : chars1){
            if(set.contains(c)){
                ans++;
            }
        }

        return ans;
    }
}