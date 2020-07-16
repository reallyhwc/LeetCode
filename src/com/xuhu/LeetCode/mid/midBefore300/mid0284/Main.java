package com.xuhu.LeetCode.mid.midBefore300.mid0284;

import com.xuhu.LeetCode.a.util.ListUtils;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List list = ListUtils.createListByArray(new Integer[]{1,2,3});
        PeekingIterator iterator = new PeekingIterator(list.iterator());

        System.out.println(iterator.next());
        System.out.println(iterator.peek());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());

    }
}