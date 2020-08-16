package com.xuhu.LeetCode.ojEveryDay.Y2020.M08.D16;


class Solution {

    int m;
    int n;
    int[][] operate = {{0, 0, 1, -1},
            {1, -1, 0, 0}};


    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (null == image || image.length == 0 || image[0].length == 0){
            return image;
        }
        m = image.length;
        n = image[0].length;
        dfs(image,sr,sc,newColor,image[sr][sc]);
        return image;
    }

    private void dfs(int[][] image, int i, int j, int newColor, int target){
        if (i < 0 || i >= m ||  j < 0 || j >= n){
            return;
        }
        if (image[i][j] != target || image[i][j] == newColor){
            return;
        }
        image[i][j] = newColor;
        for (int k = 0; k < 4; k++){
            dfs(image,i+operate[0][k],j+operate[1][k],newColor,target);
        }
    }
}