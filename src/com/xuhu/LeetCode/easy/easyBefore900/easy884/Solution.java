package com.xuhu.LeetCode.easy.easyBefore900.easy884;


import java.util.*;

class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        String[] sa = A.split(" ");
        String[] sb = B.split(" ");
        Map<String,Integer> map = new HashMap<>();
        for(String s : sa){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(String s : sb){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        List<String> ans = new ArrayList<>();
        for( Map.Entry<String,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                ans.add(entry.getKey());
            }
        }
        return ans.toArray(new String[ans.size()]);
    }
}