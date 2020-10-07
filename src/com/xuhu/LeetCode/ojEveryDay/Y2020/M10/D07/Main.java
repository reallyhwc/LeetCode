package com.xuhu.LeetCode.ojEveryDay.Y2020.M10.D07;

import com.xuhu.LeetCode.a.util.ListUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] array = {1,2,0};
        solution.sortColors(array);
        ListUtils.pringlnArrays(array);
    }
}