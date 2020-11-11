package com.xuhu.LeetCode.ojEveryDay.Y2020.M11.D09;

import com.xuhu.LeetCode.a.util.ListUtils;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListUtils.pringlnDoubleArrays(solution.kClosest(new int[][]{{1, 3}, {-2, 2}}, 1));
        ListUtils.pringlnDoubleArrays(solution.kClosest(new int[][]{{3, 3}, {5, -1}, {-2, 4}}, 2));
    }
}