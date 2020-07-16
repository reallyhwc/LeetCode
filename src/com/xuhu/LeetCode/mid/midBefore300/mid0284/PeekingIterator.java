package com.xuhu.LeetCode.mid.midBefore300.mid0284;

import java.util.Iterator;

class PeekingIterator implements Iterator<Integer> {

    private Iterator<Integer> iterator;
    private Integer tempPeek;


    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        this.iterator = iterator;
        tempPeek = null;
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        if(null == tempPeek){
            tempPeek = iterator.next();
        }
        return tempPeek;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        if (tempPeek == null){
            return iterator.next();
        }
        Integer ans = tempPeek;
        tempPeek = null;
        return ans;
    }

    @Override
    public boolean hasNext() {
        return tempPeek != null || iterator.hasNext();
    }
}