package com.xuhu.LeetCode.easy.easyBefore400.easy0345;


import java.util.Arrays;
import java.util.HashSet;

class Solution {

    private final static HashSet<Character> vowels = new HashSet<>(
            Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i < j){
            if(vowels.contains(chars[i])){
                if(vowels.contains(chars[j])){
                    char temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                    i++;
                    j--;
                }else{
                    j--;
                }
            }else{
                if(vowels.contains(chars[j])){
                    i++;
                }else{
                    i++;
                    j--;
                }
            }
        }
        return new String(chars);
    }
}