package com.xuhu.LeetCode.mid.midBefore100.mid0079;


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