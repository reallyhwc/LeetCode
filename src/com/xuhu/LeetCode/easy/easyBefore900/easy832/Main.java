package com.xuhu.LeetCode.easy.easyBefore900.easy832;

import com.xuhu.LeetCode.a.util.ListUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[][] arrays = {{1,1,0},{1,0,1},{0,0,0}};
        ListUtils.pringlnDoubleArrays(solution.flipAndInvertImage(arrays));
    }
}