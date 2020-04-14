package com.xuhu.LeetCode.mid.midBefore100.mid0017;


import java.util.ArrayList;
import java.util.List;

class Solution {
    String[] strings = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if(null == digits || digits.length() == 0) return list;
        if(digits.length() == 1){
            String s = strings[Integer.parseInt(digits)];
            for(char c : s.toCharArray()){
                list.add(String.valueOf(c));
            }
            return list;
        }
        List<String> stringList = letterCombinations(digits.substring(1));

        char[] chars = strings[(int)digits.charAt(0)-'0'].toCharArray();
        for(char c : chars){
            for(String s : stringList){
                list.add(c + s);
            }
        }
        return list;
    }
}