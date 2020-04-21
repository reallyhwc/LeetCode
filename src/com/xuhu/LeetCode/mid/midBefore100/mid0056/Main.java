package com.xuhu.LeetCode.mid.midBefore100.mid0056;

import com.xuhu.LeetCode.a.util.ListUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[][] array = {{1,3},{2,6},{8,10},{15,18}};
        ListUtils.pringlnDoubleArrays(solution.merge(array));
    }
}