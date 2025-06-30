package com.xuhu.LeetCode.mid.midBefore100.mid0002;

import com.xuhu.LeetCode.a.util.ListNode;
import com.xuhu.LeetCode.a.util.ListNodeUtil;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args){
//        Solution solution = new Solution();
//        ListNodeUtil.printListNode(solution.addTwoNumbers(ListNodeUtil.convertArrayToListNode(new int[]{2,4,3}),ListNodeUtil.convertArrayToListNode(new int[]{5,6,9})));

        Boolean test = null;
        Long test2 = 1L;

        Set<Long> set = new HashSet<>();
        set.add(1L);

        Boolean b = test && set.contains(test2);

        System.out.println();
    }
}