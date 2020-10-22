package com.xuhu.LeetCode.ojEveryDay.Y2020.M10.D22;


import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> partitionLabels(String S) {
        int[] last = new int[26];
        int len = S.length();
        char[] chars = S.toCharArray();
        for (int i = 0; i < len; i++) {
            last[chars[i]-'a'] = i;
        }
        int start = 0;
        int end = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            end = Math.max(end,last[chars[i] - 'a']);
            if (i == end){
                // 一旦能够走到这里，说明 从start 到end 中所有字母
                // 都已经在这个区间的字符串中出现完了
                // 需要详细的去理解一下
                list.add(end - start + 1);
                start = end + 1;
            }
        }
        return list;
    }
}



