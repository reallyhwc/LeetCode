package com.xuhu.LeetCode.ojEveryDay.Y2020.M08.D31;

import com.xuhu.LeetCode.a.util.ListUtils;

import java.util.List;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        List<List<Integer>> list1 = ListUtils.createDoubleListByDoubleArray(new Integer[][]{{1},{2},{3},{}});
        List<List<Integer>> list2 = ListUtils.createDoubleListByDoubleArray(new Integer[][]{{1,3},{3,0,1},{2},{0}});

        System.out.println(solution.canVisitAllRooms(list1));
        System.out.println(solution.canVisitAllRooms(list2));
    }
}