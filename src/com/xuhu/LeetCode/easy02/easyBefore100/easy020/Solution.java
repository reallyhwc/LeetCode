package com.xuhu.LeetCode.easy02.easyBefore100.easy020;


import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }
        if ((s.length() & 1) == 1) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (c == ')') {
                    if (stack.isEmpty() || stack.peek() != '(') {
                        return false;
                    } else {
                        stack.pop();
                    }
                } else if (c == ']') {
                    if (stack.isEmpty() || stack.peek() != '[') {
                        return false;
                    } else {
                        stack.pop();
                    }
                } else if (c == '}') {
                    if (stack.isEmpty() || stack.peek() != '{') {
                        return false;
                    } else {
                        stack.pop();
                    }
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}