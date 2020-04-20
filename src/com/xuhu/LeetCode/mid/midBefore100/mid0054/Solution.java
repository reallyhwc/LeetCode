package com.xuhu.LeetCode.mid.midBefore100.mid0054;


import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int x = matrix.length;
        if(x == 0)return list;
        int y = matrix[0].length;
        if(y == 0)return list;
        int round = (Math.min(x,y) + 1) / 2;
        x--;
        y--;

        int times = 0;
        while (round > 0){
            func(list,matrix,times,x,times,y);
            times++;
            x--;
            y--;
            round--;
        }

        return list;
    }

    private void func(List<Integer> list, int[][] matrix, int startX, int endX, int startY, int endY){
        if(startX > endX || startY > endY) return;

        if(startX == endX){
            for(int i = startY; i <= endY; i++){
                list.add(matrix[startX][i]);
            }
            return;
        }

        if(startY == endY){
            for (int i = startX; i <= endX; i++){
                list.add(matrix[i][startY]);
            }
            return;
        }

        for(int i = startY; i < endY; i++){
            list.add(matrix[startX][i]);
        }

        for(int i = startX; i < endX; i++){
            list.add(matrix[i][endY]);
        }

        for(int i = endY; i > startY; i--){
            list.add(matrix[endX][i]);
        }

        for(int i = endX; i > startX; i--){
            list.add(matrix[i][startY]);
        }

    }
}