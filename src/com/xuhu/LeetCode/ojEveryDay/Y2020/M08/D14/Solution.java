package com.xuhu.LeetCode.ojEveryDay.Y2020.M08.D14;


import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        if (s == null || s.length()  % 2 != 0 ){
            return false;
        }
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<Character> ();
        for (char c : chars){
            if (c == '{' || c =='[' || c =='('){
                stack.push(c);
            }else {
                if (c == '}'){
                    if (stack.isEmpty() || stack.peek() != '{'){
                        return false;
                    }else {
                        stack.pop();
                    }
                }else if (c == ']'){
                    if (stack.isEmpty() || stack.peek() != '['){
                        return false;
                    }else {
                        stack.pop();
                    }
                }else if (c == ')'){
                    if (stack.isEmpty() || stack.peek() != '('){
                        return false;
                    }else {
                        stack.pop();
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}