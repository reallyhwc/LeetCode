package com.xuhu.LeetCode.easy.easyBefore800.easy0748;




class Solution {
    String result = "";
    int minLength = Integer.MAX_VALUE;
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] array = method(licensePlate);
        for(String s : words){
            if(s.length() < minLength && isAHasB(method(s),array)){
                result = s;
                minLength = s.length();
            }
        }
        return result;
    }

    private int[] method(String str){
        int[] res = new int[26];
        String s = str.toLowerCase();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c >= 'a' && c <= 'z'){
                res[c-'a']++;
            }
        }
        return res;
    }

    private boolean isAHasB(int[] a, int[] b){
        for(int i = 0;i < 26; i++){
            if(a[i] < b[i]){
                return false;
            }
        }
        return true;
    }
}