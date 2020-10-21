package com.xuhu.LeetCode.ojEveryDay.Y2020.M10.D21;


class Solution {
    public boolean isLongPressedName(String name, String typed) {
        char[] chars1 = name.toCharArray();
        char[] chars2 = typed.toCharArray();
        if(chars2.length < chars1.length){
            return false;
        }
        int i = 0;
        int j = 0;
        if (chars1[i] != chars2[j] ){
            return false;
        }else {
            i++;j++;
        }
        while (i < chars1.length && j < chars2.length){
            if (chars1[i] == chars2[j]){
                i++;
                j++;
            }else if (chars1[i-1] == chars2[j] && chars2[j-1] == chars2[j]){
                j++;
            }else {
                return false;
            }
        }
        if (i != chars1.length){
            return false;
        }else {
            while (j < chars2.length){
                if (chars1[i-1] == chars2[j]){
                    j++;
                }else {
                    break;
                }
            }
        }

        return j == chars2.length;
    }
}