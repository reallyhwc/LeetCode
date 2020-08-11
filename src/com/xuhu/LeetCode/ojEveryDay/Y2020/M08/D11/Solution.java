package com.xuhu.LeetCode.ojEveryDay.Y2020.M08.D11;


class Solution {

    int m;
    int n;

    int[][] operate = {{0, 0, 1, -1},
                       {1, -1, 0, 0}};

    public void solve(char[][] board) {
        if (board == null || board.length <= 1 || board[0].length <= 1) {
            return;
        }
        m = board.length;
        n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            dfs(board,i,0,visited);
            dfs(board,i,n-1,visited);
        }
        for (int j = 1; j < n-1; j++){
            dfs(board,0,j,visited);
            dfs(board,m-1,j,visited);
        }
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]){
                    board[i][j] = 'X';
                }
            }
        }
    }

    private void dfs(char[][] board, int i, int j, boolean[][] visited) {
        if (i < 0 || i >= m || j < 0 || j >= n) {
            return;
        }
        if (board[i][j] == 'X') {
            return;
        }
        if (visited[i][j]) {
            return;
        }
        visited[i][j] = true;
        for (int k = 0; k < 4; k++){
            dfs(board,i+operate[0][k],j+operate[1][k],visited);
        }
    }
}