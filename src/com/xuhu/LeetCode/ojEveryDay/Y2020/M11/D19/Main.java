package com.xuhu.LeetCode.ojEveryDay.Y2020.M11.D19;

import com.xuhu.LeetCode.a.util.ListUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] array = {0,1,0,3,12};
        solution.moveZeroes(array);
        ListUtils.pringlnArrays(array);
    }
}