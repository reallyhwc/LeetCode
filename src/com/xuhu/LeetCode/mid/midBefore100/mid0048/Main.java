package com.xuhu.LeetCode.mid.midBefore100.mid0048;

import com.xuhu.LeetCode.a.util.ListUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        ListUtils.pringlnDoubleArrays(array);

        solution.rotate(array);

        System.out.print("----------------------\n");
        ListUtils.pringlnDoubleArrays(array);
    }
}