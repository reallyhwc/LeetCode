package com.xuhu.LeetCode.easy.easyBefore900.easy806;


class Solution {
    public int[] numberOfLines(int[] widths, String S) {
        int maxLength = 100;
        int nowLength = 0;
        int nowRow = 1;
        for(char c : S.toCharArray()){
            int tempNum = widths[c-'a'];
            if((nowLength + tempNum) <= maxLength){
                nowLength += tempNum;
            }else {
                nowRow++;
                nowLength = tempNum;
            }
        }
        if(nowLength == 0) nowRow--;
        return new int[] {nowRow,nowLength};
    }
}