package com.xuhu.LeetCode.mid.midBefore300.mid0221;


class Solution {
    public int maximalSquare(char[][] matrix) {
        if (null == matrix || matrix.length == 0){
            return 0;
        }
        int x = matrix.length;
        int y = matrix[0].length;
        int[][] ans = new int[x+1][y+1];
        int max = 0;
        for (int i = 1; i <= x; i++){
            for (int j = 1; j <= y; j++){
                if(matrix[i-1][j-1] == '1'){
                    ans[i][j] = 1 + Math.min(ans[i-1][j],Math.min(ans[i-1][j-1],ans[i][j-1]));
                    max = Math.max(max,ans[i][j]);
                }
            }
        }
        return max*max;
    }
}