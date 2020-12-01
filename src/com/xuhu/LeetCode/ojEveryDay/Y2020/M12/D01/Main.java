package com.xuhu.LeetCode.ojEveryDay.Y2020.M12.D01;

import com.xuhu.LeetCode.a.util.ListUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] array = new int[] {5,7,7,8,8,10};
        ListUtils.pringlnArrays(solution.searchRange(array,8));
        ListUtils.pringlnArrays(solution.searchRange(array,10));
//        System.out.println(solution.findEnd(array,8));
    }
}