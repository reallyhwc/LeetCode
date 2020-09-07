package com.xuhu.LeetCode.mid.midBefore300.mid0229;

import com.xuhu.LeetCode.a.util.ListUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        ListUtils.printList(solution.majorityElement(new int[]{3,2,3}));
        ListUtils.printList(solution.majorityElement(new int[]{1,1,1,3,3,2,2,2}));
    }
}