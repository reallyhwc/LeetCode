package com.xuhu.LeetCode.easy.easyBefore1000.easy925;


class Solution {
    public boolean isLongPressedName(String name, String typed) {
        char[] chars = name.toCharArray();
        char[] chars1 = typed.toCharArray();
        int i = 0;
        int j = 0;
        int nameIndex = name.length()-1;
        int typeIndex = typed.length()-1;
        while (i <= nameIndex && j <= typeIndex){
            if(chars[i] == chars1[j]){
                i++;
                j++;
                continue;
            }
            if(i != 0){
                if(chars1[j] == chars[i-1]){
                    j++;
                    continue;
                }
            }
            return false;
        }
        return i > nameIndex;
    }
}