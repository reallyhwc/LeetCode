package com.xuhu.LeetCode.ojEveryDay.Y2020.M11.D04;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    // 难得hard的思路不复杂 仔细看一下代码就可以理解了，主要思路
    // 1. 用List存储ans 最后再转换出来
    // 2. 利用begin，和end，计算合并后的总区间
    // 3. 利用一个flag标记，标记新插入的区间是否已经加入ans
    // 4. 整个遍历完了都没有插入，记得把新插入区间加入返回List
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int begin = newInterval[0];
        int end = newInterval[1];
        List<int[]> ansList = new ArrayList<>();

        boolean flag = false;
        for (int[] interval : intervals) {
            if (interval[1] < begin) {
                // 在指定区间左侧且无交集
                ansList.add(interval);
            } else if (interval[0] > end) {
                // 在指定区间右侧且无交集
                if (!flag) {
                    ansList.add(new int[]{begin, end});
                    flag = true;
                }
                ansList.add(interval);
            } else {
                // 重新调整begin end 的值
                begin = Math.min(begin, interval[0]);
                end = Math.max(end, interval[1]);
            }
        }
        if (!flag) {
            ansList.add(new int[]{begin, end});
        }
        return ansList.toArray(new int[ansList.size()][]);
    }
}