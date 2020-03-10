package com.xuhu.LeetCode.easy.easyBefore600.easy0566;

import com.xuhu.LeetCode.a.util.ListUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[][] arrays = {{1,2},{3,4}};
        ListUtils.pringlnDoubleArrays(solution.matrixReshape(arrays,1,4));
    }
}