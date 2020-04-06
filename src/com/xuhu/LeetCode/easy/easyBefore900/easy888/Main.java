package com.xuhu.LeetCode.easy.easyBefore900.easy888;

import com.xuhu.LeetCode.a.util.ListUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();

        ListUtils.pringlnArrays(solution.fairCandySwap(new int[]{1,1},new int[]{2,2}));
        ListUtils.pringlnArrays(solution.fairCandySwap(new int[]{1,2},new int[]{2,3}));
        ListUtils.pringlnArrays(solution.fairCandySwap(new int[]{2},new int[]{1,3}));
        ListUtils.pringlnArrays(solution.fairCandySwap(new int[]{1,2,5},new int[]{2,4}));
    }
}