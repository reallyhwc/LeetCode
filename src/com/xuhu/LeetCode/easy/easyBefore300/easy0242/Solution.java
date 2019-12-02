package com.xuhu.LeetCode.easy.easyBefore300.easy0242;

import java.util.HashMap;
import java.util.Map;

class Solution {
    /**
     * 一种比较慢的解决方法
     * 用map去存储字符串中各个字母的次数，现废弃
     * @param s s
     * @param t t
     * @return r
     */
    public boolean isAnagram1(String s, String t) {
        if(s == null && t == null){
            return true;
        }
        if(s == null || t == null){
            return false;
        }
        if(s.length() != t.length()){
            return false;
        }
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char SC = s.charAt(i);
            if(map.containsKey(SC)){
                map.put(SC,map.get(SC) + 1);
            }else {
                map.put(SC,1);
            }
        }
        for(int i = 0; i < t.length(); i++){
            char TC = t.charAt(i);
            if(map.containsKey(TC)){
                Integer integer = map.get(TC);
                if(integer <= 0){
                    return false;
                }
                if(integer == 1){
                    map.remove(TC);
                }else{
                    map.put(TC,integer - 1);
                }
            }else {
                return false;
            }
        }
        return true;
    }

    //简化数组版本
    public boolean isAnagram(String s, String t) {
        int[] sCounts = new int[26];
        int[] tCounts = new int[26];
        for (char c : s.toCharArray()){
            sCounts[c-'a']++;
        }
        for (char c : t.toCharArray()){
            tCounts[c-'a']++;
        }
        for(int i = 0 ; i < 26; i++){
            if(sCounts[i] != tCounts[i]){
                return false;
            }
        }
        return true;
    }
}