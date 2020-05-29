package com.xuhu.LeetCode.mid.midBefore200.mid0150;


import javax.swing.text.SimpleAttributeSet;
import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String s : tokens){
            switch (s){
                case "+" :
                    stack.push(stack.pop()+stack.pop());
                    break;
                case "-" :
                    stack.push(-stack.pop()+stack.pop());
                    break;
                case "*" :
                    stack.push(stack.pop()*stack.pop());
                    break;
                case "/" :
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b/a);
                    break;
                default:
                    stack.add(Integer.parseInt(s));
                    break;
            }
        }
        return stack.pop();
    }
}