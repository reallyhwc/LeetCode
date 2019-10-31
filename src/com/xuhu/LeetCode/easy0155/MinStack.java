package com.xuhu.LeetCode.easy0155;

import java.util.Arrays;

/**
 * @author xuhu
 * @date 2019-10-31 19:29
 */
class MinStack {

    private int[] values;
    private int size;
    private int min = Integer.MAX_VALUE;
    private int minIndex;

    /** initialize your data structure here. */
    public MinStack() {
        //新建minStack时,利用数组存放
        //并把size置为0
        values = new int[30];
        size = 0;
    }

    public void push(int x) {
        //填充值的时候，直接填充到数组的最后一个即可，并把size+1
        //当然，在填充值之前需要更新一下min值信息和下标--在 x < min 的情况下
        //在数组超过默认长度的情况下，也需要对数组进行一下扩容（java中的数组并没有动态扩容的功能）
        if(x < min){
            min = x;
            minIndex = size;
        }
        if(size + 1 > values.length){
            expand(size * 2);
        }
        values[size++] = x;
    }

    private void expand(int newSize){
        values = Arrays.copyOf(values,newSize);
    }

    public void pop() {
        //pop 即 出栈顶元素
        //如果把当前最小值也出栈了，则重新循环一下去找出来最小元素
        size--;
        if(size <= minIndex){
            min = Integer.MAX_VALUE;
            for(int i = 0; i < size; i++){
                if(values[i] < min){
                    min = values[i];
                    minIndex = i;
                }
            }
        }
    }

    //top 直接给出数组最后一个即可
    public int top() {
        return values[size-1];
    }

    //min  有min元素，直接返回即可
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */