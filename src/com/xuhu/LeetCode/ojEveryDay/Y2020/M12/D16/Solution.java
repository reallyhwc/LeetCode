package com.xuhu.LeetCode.ojEveryDay.Y2020.M12.D16;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        char[] chars = pattern.toCharArray();
        String[] strings = s.split(" ");
        if (strings.length != chars.length){
            return false;
        }
        Set<String> wordSet = new HashSet<>();
        Map<Character,String> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++){
            if (map.containsKey(chars[i])){
                if (!strings[i].equals(map.get(chars[i]))){
                    return false;
                }
            }else {
                if (wordSet.contains(strings[i])){
                    return false;
                }
                map.put(chars[i],strings[i]);
                wordSet.add(strings[i]);
            }
        }
        return true;
    }
}