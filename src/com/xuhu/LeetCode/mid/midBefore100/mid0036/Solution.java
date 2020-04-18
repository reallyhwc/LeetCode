package com.xuhu.LeetCode.mid.midBefore100.mid0036;


class Solution {
    public boolean isValidSudoku(char[][] board) {
        //记录某行某个数是否出现过
        boolean[][] row = new boolean[9][9];

        //记录某列，某个数是否出现过
        boolean[][] col = new boolean[9][9];

        //记录某个方块，某个数是否出现过
        boolean[][] block = new boolean[9][9];

        for(int i = 0; i < 9 ;i++){
            for(int j = 0; j < 9; j++){
                char c = board[i][j];
                if(c != '.'){
                    int num = c - '1';
                    int blockIndex = i / 3*3 + j / 3;
                    if(row[i][num] || col[j][num] || block[blockIndex][num]){
                        return false;
                    }else {
                        row[i][num] = true;
                        col[j][num] = true;
                        block[blockIndex][num] = true;
                    }
                }
            }
        }
        return true;
    }
}