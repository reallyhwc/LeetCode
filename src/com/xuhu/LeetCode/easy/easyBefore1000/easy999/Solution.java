package com.xuhu.LeetCode.easy.easyBefore1000.easy999;


class Solution {
    public int numRookCaptures(char[][] board) {
        //定义上下左右四个方向
        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if(board[i][j] == 'R'){
                    int res = 0;
                    for(int k = 0; k < 4; k++){
                        int x = i;
                        int y = j;
                        while (true){
                            x += dx[k];
                            y += dy[k];
                            if(x < 0 || x >= 8 || y < 0 || y >= 8 || board[x][y] == 'B'){
                                break;
                            }
                            if(board[x][y] == 'p'){
                                res++;
                                break;
                            }
                        }
                    }
                    return res;
                }
            }
        }
        return 0;
    }
}