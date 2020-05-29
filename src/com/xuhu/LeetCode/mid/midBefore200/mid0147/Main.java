package com.xuhu.LeetCode.mid.midBefore200.mid0147;

import com.xuhu.LeetCode.a.util.ListNode;
import com.xuhu.LeetCode.a.util.ListNodeUtil;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        ListNodeUtil.printListNode(solution.insertionSortList(ListNodeUtil.convertArrayToListNode(new int[]{4,2,1,3})));
        /**
         * 第一遍走 实现2 4 1 3  前面两位是有序的
         * 第二遍走 需要实现前三位是否有序 很明显不符合，则把1 插入到已经拍好序列的 2 4 中间去，形成1 2 4 再加上尾巴 3
         * 第三遍走 需实现前四位有序 把3 抽出来 插入到1 2 4 中间去 形成 1 2 3 4
         */
    }
}