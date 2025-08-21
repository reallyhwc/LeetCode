package com.xuhu.LeetCode.hot.hash.A00049;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            int[] chars = new int[26];

            int len = str.length();

            for (int i = 0; i < len; i++) {
                chars[str.charAt(i) - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                sb.append(chars[i]);
            }

            String key = sb.toString();
            map.put(key, map.getOrDefault(key, new ArrayList<>()));
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}