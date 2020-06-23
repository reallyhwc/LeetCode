package com.xuhu.LeetCode.mid.midBefore200.mid0173;

import com.xuhu.LeetCode.a.util.TreeUtils;

public class Main {
    public static void main(String[] args){
        BSTIterator iterator = new BSTIterator(TreeUtils.create(new Integer[]{7,3,15,null,null,9,20},0));
        System.out.println(iterator.next());        // 返回 3
        System.out.println(iterator.next());        // 返回 7
        System.out.println(iterator.hasNext());     // 返回 true
        System.out.println(iterator.next());        // 返回 9
        System.out.println(iterator.hasNext());     // 返回 true
        System.out.println(iterator.next());        // 返回 15
        System.out.println(iterator.hasNext());     // 返回 true
        System.out.println(iterator.next());        // 返回 20
        System.out.println(iterator.hasNext());     // 返回 false
    }
}