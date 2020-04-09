package com.xuhu.LeetCode.easy.easyBefore1000.easy985;

import com.xuhu.LeetCode.a.util.ListUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        ListUtils.pringlnArrays(solution.sumEvenAfterQueries(new int[]{1,2,3,4},new int[][]{{1,0},{-3,1},{-4,0},{2,3}}));
    }
}