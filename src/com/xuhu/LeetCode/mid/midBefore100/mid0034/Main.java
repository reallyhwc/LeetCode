package com.xuhu.LeetCode.mid.midBefore100.mid0034;

import com.xuhu.LeetCode.a.util.ListUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        ListUtils.pringlnArrays(solution.searchRange(new int[]{5,7,7,8,8,10},8));
        ListUtils.pringlnArrays(solution.searchRange(new int[]{5,7,7,8,8,10},6));
    }
}