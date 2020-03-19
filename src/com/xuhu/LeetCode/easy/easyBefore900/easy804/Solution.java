package com.xuhu.LeetCode.easy.easyBefore900.easy804;


import java.util.HashSet;
import java.util.Set;

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>();
        for(String s : words){
            String str = morse(s);
            if(!set.contains(str)){
                set.add(str);
            }
        }
        return set.size();
    }
    String[] morseWords = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    private String morse(String s){
        StringBuffer ans = new StringBuffer();
        for(char c : s.toCharArray()){
            ans.append(morseWords[c-'a']);
        }
        return ans.toString();
    }
}