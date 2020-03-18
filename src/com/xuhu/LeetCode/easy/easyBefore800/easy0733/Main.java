package com.xuhu.LeetCode.easy.easyBefore800.easy0733;

import com.xuhu.LeetCode.a.util.ListUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[][] iamge = {{1,1,1},{1,1,0},{1,0,1}};
        ListUtils.pringlnDoubleArrays(solution.floodFill(iamge,1,1,2));
    }
}