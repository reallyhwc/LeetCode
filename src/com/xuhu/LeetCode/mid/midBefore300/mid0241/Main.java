package com.xuhu.LeetCode.mid.midBefore300.mid0241;

import com.xuhu.LeetCode.a.util.ListUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        ListUtils.printList(solution.diffWaysToCompute("2-1-1"));
        ListUtils.printList(solution.diffWaysToCompute("2*3-4*5"));
    }
}