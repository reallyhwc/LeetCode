package com.xuhu.LeetCode.easy.easyBefore700.easy657;


class Solution {
    public boolean judgeCircle(String moves) {
        if(moves == null || moves.length() == 0){
            return true;
        }
        char[] chars = moves.toCharArray();
        int RNUM = 0;
        int LNUM = 0;
        int UNUM = 0;
        int DNUM = 0;
        for(char c : chars){
            if(c == 'R') {
                RNUM++;
                continue;
            }
            if(c == 'L') {
                LNUM++;
                continue;
            }
            if(c == 'U') {
                UNUM++;
                continue;
            }
            if(c == 'D') {
                DNUM++;
                continue;
            }
        }
        return LNUM == RNUM && UNUM == DNUM;
    }
}