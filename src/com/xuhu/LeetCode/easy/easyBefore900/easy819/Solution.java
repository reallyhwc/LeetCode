package com.xuhu.LeetCode.easy.easyBefore900.easy819;


import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        Map<String, Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        for (String s : banned){
            set.add(s);
        }


        int lastIndex = 0;
        String ans = null;
        int maxTime = 0;
        for(int i = 0; i < paragraph.length(); i++){
            char c = paragraph.charAt(i);
            if((c <= 'Z' && c >= 'A') || (c <= 'z' && c >= 'a')){
                continue;
            }
            String s = paragraph.substring(lastIndex,i).toLowerCase();
            lastIndex = i+1;
            if(s != null && s.length() > 0 && !set.contains(s)){
                map.put(s,map.getOrDefault(s,0)+1);
                if(map.get(s) > maxTime){
                    maxTime = map.get(s);
                    ans = s;
                }
            }
        }
        String s = paragraph.substring(lastIndex,paragraph.length()).toLowerCase();
        if(s != null && s.length() > 0 && !set.contains(s)){
            map.put(s,map.getOrDefault(s,0)+1);
            if(map.get(s) > maxTime){
                maxTime = map.get(s);
                ans = s;
            }
        }
        return ans;
    }
}