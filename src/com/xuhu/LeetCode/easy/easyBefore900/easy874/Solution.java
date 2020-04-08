package com.xuhu.LeetCode.easy.easyBefore900.easy874;


import java.util.HashSet;
import java.util.Set;

class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int[] dx = new int[]{0,1,0,-1};
        int[] dy = new int[]{1,0,-1,0};

        int x = 0;
        int y = 0;
        int di = 0;

        Set<Long> obstacleSet = new HashSet<>();

        for(int[] obstacle : obstacles){
            long ox = (long)obstacle[0] + 30000;
            long oy = (long)obstacle[1] + 30000;
            obstacleSet.add((ox<<16)+oy);
        }

        int ans = 0;

        //di 表示当前操作方向
        for(int cmd : commands){
            if(cmd == -2){
                di = (di + 3) % 4;
            }else if(cmd == -1){
                di = (di + 1) % 4;
            }else {
                for(int k = 0; k < cmd; k++){
                    int nx = x + dx[di];
                    int ny = y + dy[di];
                    long code = (((long)nx + 30000) << 16) + ((long)ny + 30000);
                    //如果碰到障碍物
                    if(!obstacleSet.contains(code)){
                        x = nx;
                        y = ny;
                        ans = Math.max(ans,x * x + y * y);
                    }
                }
            }
        }
        return ans;
    }
}