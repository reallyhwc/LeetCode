package com.xuhu.LeetCode.mid.midBefore300.mid0289;


class Solution {

    // 用作周边点位判断
    private static int[] DX = {-1,-1,-1, 0,0, 1,1,1};
    private static int[] DY = {-1, 0, 1,-1,1,-1,0,1};

    public void gameOfLife(int[][] board) {
        if (null == board || board.length == 0){
            return;
        }
        int X = board.length;
        int Y = board[0].length;
        for (int i = 0; i < X; i++){
            for (int j = 0; j < Y; j++){
                // 对于每个点位来一波周边点位判断
                // 统计一下这个点位周边的活的细胞数
                int count = 0;
                for (int k = 0; k < 8; k++){
                    int nowX = i + DX[k];
                    int nowY = j + DY[k];
                    if (nowX >= 0 && nowX < X && nowY >= 0 && nowY < Y){
                        //  &1 的意思是仅取第一位表示的数，因为其他位的数字可能会表名其他状态
                        count += board[nowX][nowY] & 1;
                    }
                }
                // 统计完这个点位的周边活的细胞数之后，再来计算一下当前点位的下一个状态
                // 当前点位目前为活的
                if ((board[i][j] & 1) > 0){
                    // 周边活细胞为2 or 3 下一步也是活的（这边使用int的第二位来表示下一步的状态）
                    if (count >= 2 && count <= 3){
                        board[i][j] = 0b11;
                    }
                    // else的话，不执行任何操作，（二进制用来表达的第二位是0  所以不用执行任何操作）
                }else {
                    // 如果当前细胞是死的 且周边活的细胞的数目不少于三个 那么下一步的时候当前细胞变成活的
                    if (count == 3){
                        // 把当前节点的下一位置为1
                        board[i][j] = 0b10;
                    }
                }
            }
        }
        for (int i = 0; i < X; i++){
            for (int j = 0; j < Y; j++){
                // 当前点位状态转换成下一步
                board[i][j] >>= 1;
            }
        }

    }
}