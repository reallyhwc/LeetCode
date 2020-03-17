package com.xuhu.LeetCode.easy.easyBefore800.easy0720;


import java.util.*;

class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        Set<String> set = new HashSet<>();
        String res = "";
        for(String s : words){
            if(s.length() == 1 || set.contains(s.substring(0,s.length()-1))){
                res = s.length() > res.length() ? s : res;
                set.add(s);
            }
        }
        return res;
    }
}