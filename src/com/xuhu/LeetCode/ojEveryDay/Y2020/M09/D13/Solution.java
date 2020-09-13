package com.xuhu.LeetCode.ojEveryDay.Y2020.M09.D13;


class Solution {

    /*
    // 代码更简洁 速度更快的版本 参考
    class Solution {
    int x;
    int y;
    int length;
    public boolean exist(char[][] board, String word) {
        this.x = board.length;
        this.y = board[0].length;
        this.length = word.length();
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                if(search(board,word,i,j,0)){
                    return true;
                }
            }
        }

        return false;
    }

    private boolean search(char[][] board, String word, int i, int j, int k){
        if(k >= length){
            return true;
        }
        if(i < 0 || i >= x || j < 0 || j >= y || board[i][j] != word.charAt(k)) return false;

        board[i][j] += 256;
        boolean result = search(board,word,i,j-1,k+1) || search(board,word,i,j+1,k+1) ||
                search(board,word,i-1,j,k+1) || search(board,word,i+1,j,k+1);
        board[i][j] -= 256;
        return result;
    }
}
     */

    int m = 0;
    int n = 0;
    int[][] operate = {{0, 0, 1, -1},
                       {1, -1, 0, 0}};

    public boolean exist(char[][] board, String word) {
        m = board.length;
        n = board[0].length;
        boolean[][] hasUsed = new boolean[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)){
                    hasUsed[i][j] = true;
                    if (dfs(board,i,j,word,0,hasUsed)){
                        return true;
                    }
                    hasUsed[i][j] = false;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, int i, int j, String word, int wordIndex, boolean[][] hasUsed){
//        if (i < 0 || i >= m || j < 0 || j >= n){
//            return false;
//        }
//        if (board[i][j] != word.charAt(wordIndex)){
//            return false;
//        }
        if (wordIndex == word.length() - 1){
            return true;
        }
        for (int k = 0; k < 4; k++){
            int nowI = i + operate[0][k];
            int nowJ = j + operate[1][k];
            if (nowI >= 0 && nowI < m && nowJ >= 0 && nowJ < n && board[nowI][nowJ] == word.charAt(wordIndex+1) && !hasUsed[nowI][nowJ]){
                hasUsed[nowI][nowJ] = true;
                if (dfs(board,nowI,nowJ,word,wordIndex+1, hasUsed)){
                    return true;
                }
                hasUsed[nowI][nowJ] = false;

            }
        }
        return false;
    }
}