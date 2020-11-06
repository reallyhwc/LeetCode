package com.xuhu.LeetCode.ojEveryDay.Y2020.M11.D06;

import com.xuhu.LeetCode.a.util.ListUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        ListUtils.pringlnArrays(solution.sortByBits(new int[]{0,1,2,3,4,5,6,7,8}));
        ListUtils.pringlnArrays(solution.sortByBits(new int[]{1024,512,256,128,64,32,16,8,4,2,1}));
        ListUtils.pringlnArrays(solution.sortByBits(new int[]{1024,512,256,128,64,32,16,8,4,2,1}));
        ListUtils.pringlnArrays(solution.sortByBits(new int[]{10000,10000}));
        ListUtils.pringlnArrays(solution.sortByBits(new int[]{2,3,5,7,11,13,17,19}));
    }
}