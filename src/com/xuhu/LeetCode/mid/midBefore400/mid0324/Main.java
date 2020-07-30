package com.xuhu.LeetCode.mid.midBefore400.mid0324;

import com.xuhu.LeetCode.a.util.ListUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] nums = {1, 5, 1, 1, 6, 4};
        solution.wiggleSort(nums);
        ListUtils.pringlnArrays(nums);
    }
}