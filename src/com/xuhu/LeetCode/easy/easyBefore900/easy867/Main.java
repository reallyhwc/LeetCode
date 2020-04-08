package com.xuhu.LeetCode.easy.easyBefore900.easy867;

import com.xuhu.LeetCode.a.util.ListUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[][] arrays = {{1,2,3},{4,5,6}};
        ListUtils.pringlnDoubleArrays(solution.transpose(arrays));
    }
}