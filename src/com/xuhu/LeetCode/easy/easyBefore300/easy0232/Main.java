package com.xuhu.LeetCode.easy.easyBefore300.easy0232;

public class Main {
    public static void main(String[] args){
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);

        System.out.println(queue.peek());
        System.out.println(queue.pop());
        System.out.println(queue.empty());
    }
}