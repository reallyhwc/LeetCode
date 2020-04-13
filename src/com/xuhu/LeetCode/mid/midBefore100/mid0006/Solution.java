package com.xuhu.LeetCode.mid.midBefore100.mid0006;


class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;

        StringBuilder ret = new StringBuilder();
        int N = s.length();
        //计算有多少个类V字形的循环
        int cycleLen = 2 * numRows - 2;

        for(int i = 0; i < numRows; i++){
            //直接拼接每一行的字母内容，理解下面那个循环等效于理解整个题目
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