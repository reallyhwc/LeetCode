package com.xuhu.LeetCode.ojEveryDay.Y2021.M04.D06;

import com.xuhu.LeetCode.a.util.ListUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] array = new int[]{1,1,1,2,2,3};
        System.out.println(solution.removeDuplicates(array));
        ListUtils.pringlnArrays(array);
    }
}