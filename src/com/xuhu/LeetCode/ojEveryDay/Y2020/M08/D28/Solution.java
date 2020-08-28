package com.xuhu.LeetCode.ojEveryDay.Y2020.M08.D28;


class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        char[] chars = moves.toCharArray();
        for (char c : chars){
            switch (c){
                case 'R':
                    x++;
                    break;
                case 'L':
                    x--;
                    break;
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                default :
                    break;
            }
        }
        return x == 0 && y == 0;
    }
}