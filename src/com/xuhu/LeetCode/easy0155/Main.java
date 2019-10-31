package com.xuhu.LeetCode.easy0155;

public class Main {
    public static void main(String[] args){
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());//--> 返回 -3.
        minStack.pop();
        System.out.println(minStack.top());   //--> 返回 0.
        System.out.println(minStack.getMin());//--> 返回 -2.
    }
}