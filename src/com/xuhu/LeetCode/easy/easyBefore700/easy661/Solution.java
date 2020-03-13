package com.xuhu.LeetCode.easy.easyBefore700.easy661;

class Solution {
    public int[][] imageSmoother(int[][] M) {
        if(M == null || M.length == 0 || M[0].length == 0){
            return M;
        }
        int width = M[0].length;
        int high = M.length;
        int[][] result = new int[high][width];

        for(int i = 0; i < high; i++) {
            for(int j = 0; j < width; j++) {
                int temp = 0;
                int num = 0;
                if(((i - 1) >= 0 && (i - 1) <= high - 1) && ((j - 1) >= 0 && (j - 1) <= width - 1)) {
                    temp += M[i-1][j-1];
                    num++;
                }
                if(((i - 1) >= 0 && (i - 1) <= high - 1) && ((j) >= 0 && (j) <= width - 1)) {
                    temp += M[i-1][j];
                    num++;
                }
                if(((i - 1) >= 0 && (i - 1) <= high - 1) && ((j + 1) >= 0 && (j + 1) <= width - 1)) {
                    temp += M[i-1][j+1];
                    num++;
                }


                if(((i) >= 0 && (i) <= high - 1) && ((j - 1) >= 0 && (j - 1) <= width - 1)) {
                    temp += M[i][j-1];
                    num++;
                }
                if(((i) >= 0 && (i) <= high - 1) && ((j) >= 0 && (j) <= width - 1)) {
                    temp += M[i][j];
                    num++;
                }
                if(((i) >= 0 && (i) <= high - 1) && ((j + 1) >= 0 && (j + 1) <= width - 1)) {
                    temp += M[i][j+1];
                    num++;
                }


                if(((i + 1) >= 0 && (i + 1) <= high - 1) && ((j - 1) >= 0 && (j - 1) <= width - 1)) {
                    temp += M[i+1][j-1];
                    num++;
                }
                if(((i + 1) >= 0 && (i + 1) <= high - 1) && ((j) >= 0 && (j) <= width - 1)) {
                    temp += M[i+1][j];
                    num++;
                }
                if(((i + 1) >= 0 && (i + 1) <= high - 1) && ((j + 1) >= 0 && (j + 1) <= width - 1)) {
                    temp += M[i+1][j+1];
                    num++;
                }

                result[i][j] = (temp / num);
            }
        }
        return result;
    }

    public int[][] imageSmoother_juanji(int[][] M) {
        int R = M.length, C = M[0].length;
        int[][] ans = new int[R][C];

        for (int r = 0; r < R; ++r)
            for (int c = 0; c < C; ++c) {
                int count = 0;
                for (int nr = r-1; nr <= r+1; ++nr)
                    for (int nc = c-1; nc <= c+1; ++nc) {
                        if (0 <= nr && nr < R && 0 <= nc && nc < C) {
                            ans[r][c] += M[nr][nc];
                            count++;
                        }
                    }
                ans[r][c] /= count;
            }
        return ans;
    }
}