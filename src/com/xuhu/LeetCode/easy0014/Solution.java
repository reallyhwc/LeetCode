package com.xuhu.LeetCode.easy0014;


class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length ==0){
            return "";
        }
        int minLength = strs[0].length();
        int length = strs.length;
        StringBuffer sb = new StringBuffer();
        //下面这个循环，去求出整个字符串组中，最短的一条字符串的常速
        for(String S : strs){
            minLength = (minLength > S.length() ? S.length() : minLength);
        }

        //一个个字符去每个字符串中比对
        //即，如果所有字符串的下标为I的字符都为c，则把该字符添加进返回值中
        //否则，一旦有不符合的，立即返回
        for(int i = 0; i < minLength; i++){
            char c = strs[0].charAt(i);
            int j = 1;
            while(j < length){
                if(strs[j].charAt(i) != c){
                    return sb.toString();
                }
                j++;
            }
            sb.append(c);
        }

        return  sb.toString();
    }
}