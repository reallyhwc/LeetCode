package com.xuhu.LeetCode.ojEveryDay.Y2021.M01.D05;

import com.xuhu.LeetCode.a.util.ListUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        ListUtils.printLnLists(solution.largeGroupPositions("abbxxxxzyy"));
        ListUtils.printLnLists(solution.largeGroupPositions("abc"));
        ListUtils.printLnLists(solution.largeGroupPositions("abcdddeeeeaabbbcd"));
        ListUtils.printLnLists(solution.largeGroupPositions("aba"));
    }
}