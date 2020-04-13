package com.xuhu.LeetCode.mid.midBefore100.mid0006;


class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;

        StringBuilder ret = new StringBuilder();
        int N = s.length();
        int cycleLen = 2 * numRows - 2;

        for(int i = 0; i < numRows; i++){
            for(int j = 0; j + i < N; j += cycleLen){
                ret.append(s.charAt(j + i));
                if(i != 0 && i != numRows -1 && j + cycleLen - i < N){
                    ret.append(s.charAt(j + cycleLen - i));
                }
            }
        }
        return ret.toString();
    }
}