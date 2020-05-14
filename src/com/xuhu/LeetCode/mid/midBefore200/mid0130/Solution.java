package com.xuhu.LeetCode.mid.midBefore200.mid0130;


class Solution {

    private int[][] direction = {{1,0},{-1,0},{0,1},{0,-1}};
    private int row;
    private int col;

    boolean[][] hasLinkedBorder;

    public void solve(char[][] board) {
        if(board.length == 0 || board[0].length == 0)  return;
        row = board.length;
        col = board[0].length;
        hasLinkedBorder = new boolean[row][col];

        for(int i = 0; i < row; i++){
            if(board[i][0] == 'O' && !hasLinkedBorder[i][0]){
                search(board,i,0);
            }
            if(board[i][col-1] == 'O' && !hasLinkedBorder[i][col-1]){
                search(board,i,col-1);
            }
        }

        for(int j = 1; j < col-1; j++){
            if(board[0][j] == 'O' && !hasLinkedBorder[0][j]){
                search(board,0,j);
            }
            if(board[row-1][j] == 'O' && !hasLinkedBorder[row-1][j]){
                search(board,row-1,j);
            }
        }

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(!hasLinkedBorder[i][j]){
                    board[i][j] = 'X';
                }
            }
        }

    }

    private void search(char[][] board, int x, int y){
        hasLinkedBorder[x][y] = true;
        for(int i = 0; i < direction.length; i++){
            int newX = x + direction[i][0];
            int newY = y + direction[i][1];
            if(inArea(newX,newY) && !hasLinkedBorder[newX][newY] && board[newX][newY] == 'O'){
                search(board,newX,newY);
            }
        }
    }

    private boolean inArea(int x, int y){
        if(x >= 0 && x < row && y >= 0 && y < col){
            return true;
        }
        return false;
    }


}