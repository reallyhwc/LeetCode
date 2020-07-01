package com.xuhu.LeetCode.mid.midBefore300.mid0210;

import com.xuhu.LeetCode.a.util.ListUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        ListUtils.pringlnArrays(solution.findOrder(2,new int[][]{{1,0}}));
        ListUtils.pringlnArrays(solution.findOrder(4,new int[][]{{1,0},{2,0},{3,1},{3,2}}));
    }
}