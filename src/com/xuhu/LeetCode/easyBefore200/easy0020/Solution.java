package com.xuhu.LeetCode.easyBefore200.easy0020;


import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        if(s.length() == 0) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        int length = s.length();
        if(length %2 != 0){
            return false;
        }
        for(int i = 0; i < length; i++){
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
                continue;
            }
            if(c == ')'){
                if(stack.isEmpty()){
                    return false;
                }
                if(stack.pop() != '('){
                    return false;
                }
            }
            if(c == ']'){
                if(stack.isEmpty()){
                    return false;
                }
                if(stack.pop() != '['){
                    return false;
                }
            }
            if(c == '}'){
                if(stack.isEmpty()){
                    return false;
                }
                if(stack.pop() != '{'){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}