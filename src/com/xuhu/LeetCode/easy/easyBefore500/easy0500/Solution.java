package com.xuhu.LeetCode.easy.easyBefore500.easy0500;


import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] findWords(String[] words) {
        String s1 = "qwertyuiopQWERTYUIOP";
        String s2 = "asdfghjklASDFGHJKL";
        String s3 = "zxcvbnmZXCVBNM";
        List<String> list = new ArrayList<>();
        for(String str : words){
            boolean temp = false;
            if(str.length() == 0){
                continue;
            }
            if(s1.indexOf(str.charAt(0)) >= 0){
                temp = checkMethod(str,s1);
            }else if(s2.indexOf(str.charAt(0)) >= 0){
                temp = checkMethod(str,s2);
            }else if(s3.indexOf(str.charAt(0)) >= 0){
                temp = checkMethod(str,s3);
            }
            if(temp){
                list.add(str);
            }
        }
        return list.toArray(new String[list.size()]);
    }

    public boolean checkMethod(String str, String s){
        if(str == null || str.length() < 2){
            return true;
        }
        for(int i = 1; i < str.length(); i++){
            if(s.indexOf(str.charAt(i)) < 0){
                return false;
            }
        }
        return true;
    }
}