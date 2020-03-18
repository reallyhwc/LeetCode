package com.xuhu.LeetCode.easy.easyBefore800.easy0733;


class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int target = image[sr][sc];
        dfs(image,newColor,sr,sc,target);
        return image;
    }

    private void dfs(int[][] image, int newColor, int i, int j, int target) {
        if(image[i][j] == newColor ||image[i][j] != target) return;

        image[i][j] = newColor;
        if(i > 0){
            dfs(image,newColor,i-1,j,target);
        }
        if(i < image.length - 1){
            dfs(image,newColor,i+1,j,target);
        }
        if(j > 0){
            dfs(image,newColor,i,j-1,target);
        }
        if(j < image[i].length - 1){
            dfs(image,newColor,i,j+1,target);
        }
    }
}