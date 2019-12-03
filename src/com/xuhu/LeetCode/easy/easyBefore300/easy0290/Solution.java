package com.xuhu.LeetCode.easy.easyBefore300.easy0290;


import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] strings = str.split(" ");
        char[] chars = pattern.toCharArray();
        if(chars.length != strings.length){
            return false;
        }
        Map<Character,String> map = new HashMap<>();
        for(int i = 0; i < chars.length; i++){
            char c = pattern.charAt(i);
            if(map.containsKey(c)){
                String temp = map.get(c);
                if(!temp.equals(strings[i])){
                    return false;
                }
            }else{
                if(map.containsValue(strings[i])){
                    return false;
                }
                map.put(c,strings[i]);
            }
        }
        return true;
    }
}