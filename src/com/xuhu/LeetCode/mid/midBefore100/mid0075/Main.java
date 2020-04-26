package com.xuhu.LeetCode.mid.midBefore100.mid0075;

import com.xuhu.LeetCode.a.util.ListUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] array = new int[]{2,0,2,1,1,0};
        solution.sortColors(array);
        ListUtils.pringlnArrays(array);
    }
}