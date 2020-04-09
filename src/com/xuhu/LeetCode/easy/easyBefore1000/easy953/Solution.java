package com.xuhu.LeetCode.easy.easyBefore1000.easy953;


class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        for(int i = 1; i < words.length; i++){
            if(convertWordToZhengChang(words[i],order).compareTo(convertWordToZhengChang(words[i-1],order)) < 0){
                return false;
            }
        }
        return true;
    }

    private String convertWordToZhengChang(String word, String order){
        char[] chars = word.toCharArray();
        for(int i = 0; i < chars.length; i++){
            int a = order.indexOf(chars[i]);
            chars[i] = (char) (a - 1 + 'a');
        }
        return new String(chars);
    }
}