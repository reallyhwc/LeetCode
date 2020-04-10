package com.xuhu.LeetCode.easy.easyBefore1000.easy994;


import com.xuhu.LeetCode.a.util.ListUtils;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    Queue<Integer> queue;
    public int orangesRotting(int[][] grid) {
        queue = new LinkedList<>();
        int X = grid[0].length;
        int Y = grid.length;
        //首先把所有烂掉的橘子放进队列中
        for(int i = 0; i < Y; i++){
            for(int j = 0; j < X; j++){
                if(grid[i][j] == 2){
                    queue.add(i * 10 + j);
                }
            }
        }
        int nowSize = queue.size();
        int times = 0;
        // 这个while循环每次腐烂一轮
        while (nowSize != 0){
            //表示当前轮次腐烂的橘子个数
            int thisTimes = 0;
            //对于每个新的烂橘子，去进行当前轮次的腐烂周边橘子
            // 在这里需要明确的是，旧的烂橘子，不会再腐烂出新的烂橘子了，因为能腐烂的早就腐烂了
            while (nowSize != 0){
                int temp = queue.poll();
                thisTimes += fuLanGeShu(grid,X,Y,temp);
                nowSize--;
            }

            //如果当前轮次没有腐烂新橘子，则跳出
            if(thisTimes == 0){
                break;
            }else {
                nowSize = queue.size();
                times++;
            }
        }
        return hasFreshOrange(grid,X,Y) ? -1 : times;
    }

    // 计算当前坐标 下一步能腐烂多少个橘子
    public int fuLanGeShu(int[][] grid, int X, int Y,int zuoBiao){
        int ans = 0;
        int YZB = zuoBiao / 10;
        int XZB = zuoBiao % 10;

        if(XZB > 0 && grid[YZB][XZB-1] == 1){
            grid[YZB][XZB-1] = 2;
            queue.add((YZB) * 10 + (XZB-1));
            ans++;
        }

        if(XZB < X-1 && grid[YZB][XZB+1] == 1){
            grid[YZB][XZB+1] = 2;
            queue.add((YZB) * 10 + (XZB+1));
            ans++;
        }

        if(YZB > 0 && grid[YZB-1][XZB] == 1){
            grid[YZB-1][XZB] = 2;
            queue.add((YZB-1) * 10 + XZB);
            ans++;
        }

        if(YZB < Y-1 && grid[YZB+1][XZB] == 1){
            grid[YZB+1][XZB] = 2;
            queue.add((YZB+1) * 10 + XZB);
            ans++;
        }

        return ans;
    }

    private boolean hasFreshOrange(int[][] grid, int X, int Y){
        for(int i = 0; i < Y; i++){
            for(int j = 0; j < X; j++){
                if(grid[i][j] == 1){
                    return true;
                }
            }
        }
        return false;
    }
}