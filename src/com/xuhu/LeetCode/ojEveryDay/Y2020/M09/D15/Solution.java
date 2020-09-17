package com.xuhu.LeetCode.ojEveryDay.Y2020.M09.D15;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    private int[] line = new int[9];
    private int[] column = new int[9];
    private int[][] block = new int[3][3];
    private boolean valid = false;
    private List<int[]> spaces = new ArrayList<int[]>();

    public void solveSudoku(char[][] board) {
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                if (board[i][j] != '.') {
                    int digit = board[i][j] - '0' - 1;
                    flip(i, j, digit);
                }
            }
        }

        while (true) {
            boolean modified = false;
            for (int i = 0; i < 9; ++i) {
                for (int j = 0; j < 9; ++j) {
                    if (board[i][j] == '.') {
                        int mask = ~(line[i] | column[j] | block[i / 3][j / 3]) & 0x1ff;
                        if ((mask & (mask - 1)) == 0) {
                            int digit = Integer.bitCount(mask - 1);
                            flip(i, j, digit);
                            board[i][j] = (char) (digit + '0' + 1);
                            modified = true;
                        }
                    }
                }
            }
            if (!modified) {
                break;
            }
        }

        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                if (board[i][j] == '.') {
                    spaces.add(new int[]{i, j});
                }
            }
        }

        dfs(board, 0);
    }

    public void dfs(char[][] board, int pos) {
        if (pos == spaces.size()) {
            valid = true;
            return;
        }

        int[] space = spaces.get(pos);
        int i = space[0], j = space[1];
        int mask = ~(line[i] | column[j] | block[i / 3][j / 3]) & 0x1ff;
        for (; mask != 0 && !valid; mask &= (mask - 1)) {
            int digitMask = mask & (-mask);
            int digit = Integer.bitCount(digitMask - 1);
            flip(i, j, digit);
            board[i][j] = (char) (digit + '0' + 1);
            dfs(board, pos + 1);
            flip(i, j, digit);
        }
    }

    public void flip(int i, int j, int digit) {
        line[i] ^= (1 << digit);
        column[j] ^= (1 << digit);
        block[i / 3][j / 3] ^= (1 << digit);
    }


//    private boolean[][] row;
//    private boolean[][] col;
//    private boolean[][] block;
//
//    public void solveSudoku(char[][] board) {
//
//        //记录某行某个数是否出现过
//        row = new boolean[9][9];
//
//        //记录某列，某个数是否出现过
//        col = new boolean[9][9];
//
//        //记录某个方块，某个数是否出现过
//        block = new boolean[9][9];
//
//        int emptyNum = 0;
//        for (int i = 0; i < 9; i++){
//            for (int j = 0; j < 9; j++){
//                if (board[i][j] == '.'){
//                    emptyNum++;
//                }else {
//                    int num = board[i][j] - '0';
//                    row[i][num] = true;
//                    row[j][num] = true;
//                    row[i/9 + j / 3][num] = true;
//                }
//            }
//        }
//
//    }
//
//    private void backTrace(char[][] board, int emptyNum, int beginI, int beginJ){
//        if (emptyNum == 0){
//            return;
//        }
//        for (int nowI = beginI; nowI < 9; nowI++){
//            for (int nowJ = beginJ; nowJ < 9; nowJ++){
//                if (board[nowI][nowJ] == '.'){
//                    boolean[] couldSet = couldSetAtThisIndex(board,nowI,nowJ);
//                    for (int k = 0; k < 9; k++){
//                        if (couldSet[k]){
//                            board[nowI][nowJ] = (char) ('1' + k);
//                            backTrace(board,emptyNum-1,beginI + (beginJ>= 8 ? 1 : 0),beginJ >= 8 ? 1 : beginJ + 1);
//                            board[nowI][nowJ] = '.';
//                        }
//                    }
//                }
//            }
//        }
//    }
//
//    private boolean[] couldSetAtThisIndex(char[][] board, int i, int j){
//        boolean[] ans = new boolean[9];
//        Arrays.fill(ans,true);
//        for (int k = 0; k < 9; k++) {
//            if (board[i][k] != '.'){
//                ans[board[i][k] - '0'] = false;
//            }
//            if (board[k][j] != '.'){
//                ans[board[k][j] - '0'] = false;
//            }
//        }
//        return ans;
//    }
}